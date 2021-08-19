package com.funny.trade.application.service;

import com.funny.combo.core.event.EventBusI;
import com.funny.combo.core.result.SingleResponse;
import com.funny.trade.client.dto.item.ItemDTO;
import com.funny.trade.client.dto.item.QueryItemParam;
import com.funny.trade.client.dto.order.ReceiveOrderDTO;
import com.funny.trade.client.dto.order.ReceiveOrderItemDTO;
import com.funny.trade.domain.item.service.ItemDomainService;
import com.funny.trade.domain.order.entity.OrderDataEntity;
import com.funny.trade.domain.order.enums.OrderEventEnum;
import com.funny.trade.domain.order.event.OrderEvent;
import com.funny.trade.domain.order.service.OrderDomainService;
import com.funny.trade.infra.persistence.mapper.order.OrderDataMapper;
import com.funny.trade.infra.utils.SnowflakeIdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderApplicationService {

    @Autowired
    private OrderDomainService orderDomainService;
    @Autowired
    private ItemDomainService itemDomainService;

    @Resource
    private OrderDataMapper orderDataMapper;
    @Resource
    private EventBusI eventBus;

    /**
     * 创建一个订单
     *
     * @param receiveOrderDTO
     */
    public SingleResponse receiveOrder(ReceiveOrderDTO receiveOrderDTO) {
        String orderId = SnowflakeIdUtil.nextId()+"";

        List<ReceiveOrderItemDTO> items = receiveOrderDTO.getItems();
        List<QueryItemParam> queryItemParamList = items.stream().map(t->{
            QueryItemParam queryItemParam = new QueryItemParam();
            queryItemParam.setItemId(t.getItemId());
            queryItemParam.setSkuId(t.getSkuId());
            return queryItemParam;
        }).collect(Collectors.toList());
        List<ItemDTO> itemDTOList = itemDomainService.queryItemInfo(queryItemParamList);
        //扣减库存
        itemDomainService.decreaseStock(receiveOrderDTO,itemDTOList);
        //订单入库
        boolean persist = true;
        try {
            orderDomainService.createOrder(receiveOrderDTO,itemDTOList);
        } catch (Exception e) {
            e.printStackTrace();
            persist = false;

        }
        //入库失败还库存、还优惠券
        if(!persist){
            itemDomainService.increaseStock(receiveOrderDTO,itemDTOList);
        }
        return SingleResponse.succ();
    }


    public SingleResponse payed(ReceiveOrderDTO receiveOrderDTO) {
        OrderDataEntity orderDataEntity = orderDataMapper.findByOrderId(receiveOrderDTO.getOrderId());
        if(orderDataEntity == null){
            return SingleResponse.fail("订单不存在");
        }
        try {
            OrderDataEntity update = orderDataEntity.payed();
            orderDomainService.payed(orderDataEntity,update);
            OrderEvent event = new OrderEvent(update.getOrderId(), OrderEventEnum.PAYED);
            eventBus.asyncFire(event);
        } catch (Exception e) {
            e.printStackTrace();
            return SingleResponse.fail(e.getMessage());
        }
        return SingleResponse.succ();
    }

}
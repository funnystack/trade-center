package com.funny.trade.domain.order.service;

import com.funny.trade.client.dto.item.ItemDTO;
import com.funny.trade.client.dto.order.ReceiveOrderDTO;
import com.funny.trade.domain.order.entity.OrderDataEntity;
import com.funny.trade.domain.order.entity.OrderOperateLogEntity;
import com.funny.trade.domain.order.enums.OrderEventEnum;
import com.funny.trade.domain.order.factory.B2COrderFactory;
import com.funny.trade.domain.order.repository.OrderDataRepository;
import com.funny.trade.domain.order.repository.OrderOperateLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderDomainService {


    @Autowired(required = false)
    private OrderDataRepository orderDataRepository;
    @Autowired(required = false)
    private OrderOperateLogRepository orderOperateLogRepository;

    @Autowired(required = false)
    private B2COrderFactory b2COrderFactory;

    @Transactional(rollbackFor = Exception.class)
    public void createOrder(ReceiveOrderDTO receiveOrderDTO, List<ItemDTO> itemDTOList) {
        OrderDataEntity orderData = b2COrderFactory.createB2COrder(receiveOrderDTO, itemDTOList);
        orderData.create();
        orderDataRepository.save(orderData);
    }

    @Transactional(rollbackFor = Exception.class)
    public void payed(OrderDataEntity before, OrderDataEntity after) {
        orderDataRepository.updateOrderStatus(after);
        OrderOperateLogEntity operateLogEntity = OrderOperateLogEntity.buildOperateLog(after.getOrderId(), OrderEventEnum.PAYED,
                before.getOrderStatus(), after.getOrderStatus(), before.getUserId() + "", 1, "");
        orderOperateLogRepository.save(operateLogEntity);

    }

}

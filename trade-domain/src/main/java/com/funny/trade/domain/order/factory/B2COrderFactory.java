package com.funny.trade.domain.order.factory;

import com.funny.trade.client.dto.item.ItemDTO;
import com.funny.trade.client.dto.order.ReceiveOrderDTO;
import com.funny.trade.domain.order.entity.OrderDataEntity;
import com.funny.trade.domain.order.entity.valueobject.OrderItemEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class B2COrderFactory extends AbstractOrderFactory {

    public OrderDataEntity createB2COrder(ReceiveOrderDTO receiveOrderDTO, List<ItemDTO> itemDTOList) {
        OrderDataEntity orderData = new OrderDataEntity();
        List<OrderItemEntity> itemEntityList = itemDTOList.stream().map(t->{
            OrderItemEntity orderItemEntity = new OrderItemEntity();
            orderItemEntity.setOrderId(receiveOrderDTO.getOrderId());
            orderItemEntity.setItemNum(1);
            orderItemEntity.setSkuId(t.getSkuId());
            orderItemEntity.setSkuName(t.getName());
            return orderItemEntity;
        }).collect(Collectors.toList());
        orderData.setOrderItemEntityList(itemEntityList);
        orderData.setUserId(receiveOrderDTO.getUserId());
        orderData.setAddressId(receiveOrderDTO.getAddressId());
        return orderData;
    }
}

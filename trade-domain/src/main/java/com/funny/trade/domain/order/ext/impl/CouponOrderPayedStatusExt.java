package com.funny.trade.domain.order.ext.impl;

import com.funny.combo.extension.Extension;
import com.funny.trade.domain.order.entity.OrderDataEntity;
import com.funny.trade.domain.order.enums.OrderStatusEnum;
import com.funny.trade.domain.order.ext.OrderPayedStatusExtPt;

import java.util.Date;

@Extension(useCase = "10",bizId = "10",scenario = "coupon")
public class CouponOrderPayedStatusExt implements OrderPayedStatusExtPt {
    @Override
    public OrderDataEntity updateOrderPayStatus(OrderDataEntity orderData) {
        OrderDataEntity orderDataEntity = new OrderDataEntity();
        orderDataEntity.setOrderId(orderData.getOrderId());
        orderDataEntity.setPaymentConfirmTime(new Date());
        orderDataEntity.setOrderStatus(OrderStatusEnum.WAIT_CONSUME.getKey());
        return orderDataEntity;
    }
}

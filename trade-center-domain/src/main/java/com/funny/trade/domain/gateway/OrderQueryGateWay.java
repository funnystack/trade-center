package com.funny.trade.domain.gateway;

import com.funny.trade.domain.order.OrderDataEntity;

import java.util.List;

public interface OrderQueryGateWay {

    List<OrderDataEntity> queryUserList();

    OrderDataEntity queryOrderDetail(String userId);
}

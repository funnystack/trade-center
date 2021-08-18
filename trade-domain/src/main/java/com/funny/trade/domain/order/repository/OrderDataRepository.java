package com.funny.trade.domain.order.repository;

import com.funny.trade.domain.order.entity.OrderDataEntity;

public interface OrderDataRepository {

    int save(OrderDataEntity orderData);

    int updateOrderStatus(OrderDataEntity orderData);

    int updateOrderRemark(OrderDataEntity orderData);
}

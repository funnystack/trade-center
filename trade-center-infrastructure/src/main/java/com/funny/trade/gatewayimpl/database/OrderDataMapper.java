package com.funny.trade.gatewayimpl.database;

import com.funny.combo.core.base.BaseMapper;
import com.funny.trade.domain.order.OrderDataEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDataMapper extends BaseMapper<OrderDataEntity> {
    OrderDataEntity findByOrderId(String orderId);
}

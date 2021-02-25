package com.funny.trade.gatewayimpl.database.order;

import com.funny.combo.core.base.BaseMapper;
import com.funny.trade.domain.order.entity.OrderDataEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDataMapper extends BaseMapper<OrderDataEntity> {
    OrderDataEntity findByOrderId(String orderId);
}

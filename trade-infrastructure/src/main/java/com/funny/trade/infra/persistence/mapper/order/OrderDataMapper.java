package com.funny.trade.infra.persistence.mapper.order;

import com.funny.combo.core.base.BaseMapper;
import com.funny.trade.domain.order.entity.OrderDataEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDataMapper extends BaseMapper<OrderDataEntity> {
    OrderDataEntity findByOrderId(String orderId);

    /**
     * 修改订单状态
     * @param orderDataEntity
     * @return
     */
    int updateOrderStatusByOrderId(OrderDataEntity orderDataEntity);

}

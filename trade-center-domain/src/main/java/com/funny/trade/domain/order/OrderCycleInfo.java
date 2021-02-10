package com.funny.trade.domain.order;

import com.funny.trade.domain.order.entity.OrderCycleInfoEntity;
import com.funny.trade.domain.order.enums.OperateUserTypeEnum;
import com.funny.trade.domain.order.enums.OrderEventEnum;

/**
 * 订单操作日志表
 */
public class OrderCycleInfo extends OrderCycleInfoEntity {
    /**
     * 组装orderOperateLog
     */
    public static OrderCycleInfoEntity buildCycleInfo(String orderId, OperateUserTypeEnum operateUserTypeEnum,
                                                      OrderEventEnum orderEventEnum) {
        OrderCycleInfoEntity orderCycleInfo = new OrderCycleInfoEntity();
        orderCycleInfo.setOrderId(orderId);

        return orderCycleInfo;

    }
}

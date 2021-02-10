package com.funny.trade.domain.order;

import com.funny.combo.core.exception.BizException;
import com.funny.trade.domain.order.entity.OrderDataEntity;
import com.funny.trade.domain.order.enums.OrderEventEnum;
import com.funny.trade.domain.order.enums.OrderStatusEnum;
import org.apache.commons.lang3.StringUtils;

public class OrderData extends OrderDataEntity {
    private static final long serialVersionUID = 1580961794652L;


    public OrderData closeOrder() {
        if(getId() == null){
            throw new BizException(" id is null");
        }
        if(StringUtils.isBlank(getOrderId())){
            throw new BizException(" orderId is null");
        }
        if(getOrderStatus().equals(OrderStatusEnum.CLOSED.getKey())){
            return this;
        }
        // 设置订单状态为完结
        OrderData subOrder = new OrderData();
        subOrder.setId(getId());
        subOrder.setOrderStatus(OrderStatusEnum.CLOSED.getKey());
        subOrder.setIsDel(1);
        subOrder.setRefundStatus(0);

        OrderOperateLog log = OrderOperateLog.buildOperateLog(getOrderId(), OrderEventEnum.DELETE.getKey(),
                OrderStatusEnum.WAIT_PAY.getValue(), OrderStatusEnum.CLOSED.getValue(),
                "sys_worker", 1, "");


        return this;
    }

    public OrderData rollbackCoupon() {
        return this;
    }

    public OrderData rollbackStock() {
        return this;
    }

    public OrderData rollbackPoint() {
        return this;
    }

    public OrderData sendOfcStatusMessage() {
        return this;
    }

    public OrderData sendOfcModifyMessage() {
        return this;
    }

    public OrderData sendAccountMessage() {
        return this;
    }
}

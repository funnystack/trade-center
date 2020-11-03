package com.funny.trade.domain.gateway;

import com.funny.trade.domain.order.OrderDataEntity;

public interface OrderOperateGateway {
    /**
     * 关闭订单
     */
    void closeOrder(OrderDataEntity orderDataEntity);

    /**
     * 取消订单
     */
    void cancelOrder(OrderDataEntity orderDataEntity);

    /**
     * 发货
     */
    void delivery(OrderDataEntity orderDataEntity);

    /**
     * 收货
     */
    void confirmReceipt(OrderDataEntity orderDataEntity);

    /**
     * 发起退款
     */
    void refundSubmit();

    /**
     * 同意退款
     */
    void refundApplyPass();

    /**
     * 拒绝退款
     */
    void refundApplyReject();
}

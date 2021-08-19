package com.funny.trade.domain.order.ext;

import com.funny.combo.core.extension.ExtensionPointI;
import com.funny.trade.domain.order.entity.OrderDataEntity;

public interface OrderPayedStatusExtPt extends ExtensionPointI {
    /**
     * 针对不同类型订单的支付改状态方法
     *
     * @param orderData 订单
     * @return
     */
    OrderDataEntity updateOrderPayStatus(OrderDataEntity orderData);
}

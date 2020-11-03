package com.funny.trade.api.order;

import com.funny.combo.core.result.Response;

public interface OrderCreateService {
    /**
     * 结算页
     * @return
     */
    Response indexOrder();

    /**
     * 下单
     * @return
     */
    Response receiveOrder();
}

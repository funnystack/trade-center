package com.funny.trade.domain.order;

import com.funny.combo.core.extension.ExtensionPointI;
import com.funny.combo.core.result.Response;
import com.funny.trade.domain.order.OrderDataEntity;

import java.util.List;

/**
 * @author fangli
 * @description     定义扩展点接口，针对不同业务线的关单方法
 */

public interface CloseOrderExtPt extends ExtensionPointI {

    /**
     * 针对不同业务线的关单方法
     *
     * @param orderDataEntity 订单
     * @return 部门
     */
    Response closeOrder(OrderDataEntity orderDataEntity);
}
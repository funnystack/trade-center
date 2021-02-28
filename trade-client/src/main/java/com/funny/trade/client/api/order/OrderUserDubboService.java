package com.funny.trade.client.api.order;

import com.funny.combo.core.result.PageResponse;
import com.funny.combo.core.result.SingleResponse;
import com.funny.trade.client.dto.order.OrderGetQry;
import com.funny.trade.client.dto.order.UserOrderDetailVo;
import com.funny.trade.client.dto.order.UserOrderListVo;
import com.funny.trade.client.dto.order.cmd.UserConfirmExpressCmd;

public interface OrderUserDubboService {

    /**
     * 用户查询订单列表
     * @param orderGetQry
     * @return
     */
    PageResponse<UserOrderListVo> getUserOrderList(OrderGetQry orderGetQry);

    /**
     * 查询订单详情
     * @param orderId
     * @return
     */
    SingleResponse<UserOrderDetailVo> getUserOrderDetail(String orderId);

    /**
     * 用户确认收货
     * @param userConfirmExpressCmd
     * @return
     */
    SingleResponse userConFirmExpress(UserConfirmExpressCmd userConfirmExpressCmd);
}

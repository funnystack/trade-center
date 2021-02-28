package com.funny.trade.client.api.order;

import com.funny.combo.core.result.PageResponse;
import com.funny.combo.core.result.SingleResponse;
import com.funny.trade.client.dto.order.OrderGetQry;
import com.funny.trade.client.dto.order.SellerOrderDetailVo;
import com.funny.trade.client.dto.order.cmd.SellerSendExpressCmd;

public interface OrderSellerDubboService {


    /**
     * 商家后台查询订单列表
     * @param orderGetQry
     * @return
     */
    PageResponse<SellerOrderDetailVo> getSellerOrderList(OrderGetQry orderGetQry);

    /**
     * 查询订单详情
     * @param orderId
     * @return
     */
    SingleResponse<SellerOrderDetailVo> getOrderDetail(String orderId);

    /**
     * 商家发货
     * @param sellerSendExpressCmd
     * @return
     */
    SingleResponse sendExpress(SellerSendExpressCmd sellerSendExpressCmd);

}

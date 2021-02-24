package com.funny.trade.domain.order.ext;

import com.funny.combo.core.result.Response;
import com.funny.combo.extension.Extension;
import com.funny.trade.domain.order.entity.OrderDataEntity;
import lombok.extern.slf4j.Slf4j;

/**
 * @author carter
 * create_date  2020/5/25 14:32
 * description     旅行家关闭订单，钉钉的扩展
 */
@Extension(bizId = "travel",useCase = "close_order",scenario = "pay_timeout")
@Slf4j
public class TravelOrderCloseExt implements CloseOrderExtPt {

    @Override
    public Response closeOrder(OrderDataEntity orderDataEntity) {
        log.info("旅行家执行关闭订单");
        return Response.buildSuccess();
    }
}

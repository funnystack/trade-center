package com.funny.trade.api.order;

import com.funny.combo.core.result.Response;
import com.funny.trade.dto.order.CloseOrderCmd;

public interface OrderOperateService {

    Response closeOrder(CloseOrderCmd closeOrderCmd);
}

package com.funny.trade.api.order;

import com.funny.trade.dto.clientobject.OrderDataCO;
import com.funny.trade.dto.order.OrderGetQry;

public interface OrderQueryService {


    OrderDataCO getOrderDataByOrderId(OrderGetQry orderGetQry);
}

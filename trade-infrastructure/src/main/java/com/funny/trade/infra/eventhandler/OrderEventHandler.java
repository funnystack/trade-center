package com.funny.trade.infra.eventhandler;

import com.funny.combo.core.result.Response;
import com.funny.combo.event.EventHandler;
import com.funny.combo.event.EventHandlerI;
import com.funny.trade.domain.order.event.OrderEvent;

@EventHandler
public class OrderEventHandler implements EventHandlerI<Response, OrderEvent> {

    @Override
    public Response execute(OrderEvent orderEvent) {
        System.out.println("发送ofc消息" + orderEvent.getOrderId());
        return Response.buildSuccess();
    }
}

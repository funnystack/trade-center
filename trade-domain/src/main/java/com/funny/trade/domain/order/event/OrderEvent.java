package com.funny.trade.domain.order.event;

import com.funny.combo.event.DomainEventI;
import com.funny.trade.domain.order.enums.OrderEventEnum;
import lombok.Data;

import java.util.Date;

@Data
public class OrderEvent implements DomainEventI {
    String orderId;
    Date timestamp;
    OrderEventEnum orderEventEnum;
    String data;

    public OrderEvent(String orderId, OrderEventEnum orderEventEnum) {
        this.orderId = orderId;
        this.orderEventEnum = orderEventEnum;
        this.timestamp = new Date();
    }
}

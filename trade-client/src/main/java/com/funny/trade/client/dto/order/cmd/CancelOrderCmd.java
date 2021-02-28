package com.funny.trade.client.dto.order.cmd;

import com.funny.combo.core.dto.AbstractCommand;

public class CancelOrderCmd extends AbstractCommand {
    private String orderId;
    private Integer userId;
    private String operatorIp;
}

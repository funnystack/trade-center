package com.funny.trade.client.dto.order;

import com.funny.combo.core.dto.AbstractCommand;
import lombok.Data;

@Data
public class OrderGetQry extends AbstractCommand {

    private String orderId;
}

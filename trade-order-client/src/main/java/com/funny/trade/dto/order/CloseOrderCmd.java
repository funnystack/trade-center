package com.funny.trade.dto.order;

import com.funny.combo.core.dto.AbstractCommand;
import lombok.Data;

@Data
public class CloseOrderCmd extends AbstractCommand {
    private String orderId;
}

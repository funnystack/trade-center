package com.funny.trade.dto.order;

import com.funny.combo.core.dto.AbstractCommand;
import com.funny.trade.dto.CommonCommand;
import lombok.Data;

@Data
public class OrderGetQry extends AbstractCommand {

    private String orderId;
}

package com.funny.trade.client.dto.order.cmd;

import com.funny.combo.core.dto.AbstractCommand;
import lombok.Data;

/**
 * 订单发货command
 * @author fangli
 */
@Data
public class UserConfirmExpressCmd extends AbstractCommand {
    private static final long serialVersionUID = 7606905682370059708L;

    private String orderId;
    private String sellerId;
    private String operator;
    private String operatorIp;
    /**
     * 物流公司id
     * @see
     */
    private Integer companyId;
    /**
     * 物流单编码
     */
    private String logisticsNo;
}

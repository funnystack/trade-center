package com.funny.trade.dto.clientobject;

import com.funny.combo.core.dto.AbstractClient;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderDataCO extends AbstractClient {

    private String orderId;

    private Integer orderStatus;

    private Long userId;

    private BigDecimal orderSum;

    private Long shouldPay;

    private Long couponSum;

}

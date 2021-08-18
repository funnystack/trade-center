package com.funny.trade.client.dto.order;

import lombok.Data;

import java.io.Serializable;

@Data
public class ReceiveOrderItemDTO implements Serializable {
    private static final long serialVersionUID = -8503072823047246063L;

    private Long itemId;
    private Long skuId;
    private Integer num;//购买的数量（单个商品）
}

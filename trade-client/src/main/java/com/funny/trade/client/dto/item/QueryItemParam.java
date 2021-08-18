package com.funny.trade.client.dto.item;

import lombok.Data;

import java.io.Serializable;

@Data
public class QueryItemParam implements Serializable {
    private String orderId;
    private Long userId;
    private Long itemId;
    private Long skuId;
    private Integer num;//数量
}

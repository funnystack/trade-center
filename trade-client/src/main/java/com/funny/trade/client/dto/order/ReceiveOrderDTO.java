package com.funny.trade.client.dto.order;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ReceiveOrderDTO implements Serializable {
    private static final long serialVersionUID = -8503072823047246063L;
    private String orderId;
    private Long userId;
    /**
     * 是否购物车提交订单
     */
    private boolean isShoppingCart = false;
    /**
     * 收货地址
     */
    private Long addressId;
    private List<ReceiveOrderItemDTO> items;

}

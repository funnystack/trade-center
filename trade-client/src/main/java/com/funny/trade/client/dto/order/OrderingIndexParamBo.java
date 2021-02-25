package com.funny.trade.client.dto.order;

import java.io.Serializable;

public class OrderingIndexParamBo implements Serializable {
    private static final long serialVersionUID = -8503072823047246063L;


    private Long userId;
    private String userName;
    /**
     * 是否购物车提交订单
     */
    private boolean isShoppingCart = false;
    /**
     * 收货地址
     */
    private Long addressId;

    private Long itemId;
    private Long skuId;
    private Integer num;//购买的数量（单个商品）
    private Long activityId;//活动id
    private String externalOrderId;//外部订单id
}

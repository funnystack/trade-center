package com.funny.trade.domain.order.entity;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import com.funny.trade.domain.order.enums.AmountTypeEnum;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 订单费用明细
 *
 */
@Data
@Entity
public class OrderPriceDetailEntity extends BaseEntity {
    private static final long serialVersionUID = -4524937833762023437L;
    /**
     * 订单号
     */
    private String orderId;

    /**
     * 金额名称
     */
    private String amountName;

    /**
     * 金额类目
     * @see AmountTypeEnum
     */
    private Integer amountType;

    /**
     * 是否支付0 否 1 需要
     */
    private Integer needPay;

    /**
     * 支付阶段
     * 1 下单阶段  2 xxx阶段 3 尾款阶段
     */
    private Integer payStep;

    /**
     * 优惠后金额
     */
    private BigDecimal promptPrice;

    /**
     * 原价（总价）
     */
    private BigDecimal originPrice;

    /**
     * itemid
     */
    private Long itemId;

    /**
     * skuid
     */
    private Long skuId;

    /**
     * 金额状态: 0未支付,1 已支付,
     */
    private Integer payStatus;
    /**
     * 备注
     */
    private String remark;

}

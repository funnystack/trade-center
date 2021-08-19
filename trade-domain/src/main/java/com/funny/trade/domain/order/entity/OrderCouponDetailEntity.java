package com.funny.trade.domain.order.entity;

import com.funny.combo.core.base.BaseEntity;
import com.funny.combo.core.ddd.annotion.Entity;
import com.funny.trade.domain.order.enums.AmountTypeEnum;
import com.funny.trade.domain.order.enums.CouponTypeEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


@Data
@Entity
public class OrderCouponDetailEntity extends BaseEntity {
    private static final long serialVersionUID = 3052914758305869814L;
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 商品id
     */
    private Long itemId;

    /**
     *sku编号
     */
    private Long skuId;

    /**
     *优惠金额
     */
    private BigDecimal discount;

    /**
     *金额类目
     * @see AmountTypeEnum
     */
    private Integer amountType;

    /**
     *优惠方式
     * @see CouponTypeEnum
     */
    private Integer couponType;

    /**
     *优惠节点
     */
    private Integer useNode;

    /**
     *数量
     */
    private Integer itemNum;

    /**
     *促销id
     */
    private Integer couponId;

    /**
     *优惠券券码
     */
    private String couponCode;

    /**
     *优惠券批次
     */
    private String couponBatchId;

    /**
     *费用
     */
    private BigDecimal costPrice;

    /**
     *优惠承担方
     */
    private Integer costType;

    /**
     *扩展字段
     */
    private String extJson;

    /**
     *coupon_end_time
     */
    private Date couponEndTime;

    /**
     *offline_price
     */
    private BigDecimal offlinePrice;

    /**
     *cash_back_price
     */
    private BigDecimal cashBackPrice;

    /**
     *coupon_category
     */
    private Integer couponCategory;

    /**
     *interest_price
     */
    private BigDecimal interestPrice;

    /**
     *deduction_price
     */
    private BigDecimal deductionPrice;

    /**
     *总单优惠金额
     */
    private BigDecimal totalCouponAmount;

    /**
     *总单金额
     */
    private BigDecimal totalOrderAmount;

    /**
     *子单优惠金额
     */
    private BigDecimal couponAmount;

    /**
     *子单订单金额
     */
    private BigDecimal orderAmount;

    /**
     *平台承担优惠金额
     */
    private BigDecimal platformCouponAmount;

    /**
     *商家承担优惠金额
     */
    private BigDecimal partnerCouponAmount;

    /**
     *子单金额占比
     */
    private Integer orderAmountPercent;

    /**
     *优惠券商家承担比例
     */
    private Integer couponPartnerRatio;

    /**
     *是否计算值,如果是1则在支付的时候会减掉该优惠金额的值
     */
    private Integer isCalculated;

    /**
     *备注
     */
    private String remark;
}

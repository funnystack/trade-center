package com.funny.trade.domain.order;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class OrderDataEntity extends BaseEntity implements Serializable {

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 商家编号
     */
    private Integer sellerId;
    /**
     * 商家名称
     */
    private String sellerName;
    /**
     * 订单类型
     */
    private Integer orderType;

    /**
     * 支付类型（1 在线支付 2 线下汇款 3 货到付款 ）
     */
    private Integer paymentType;

    /**
     * 配送方式（1 物流发货 2 上门自提 ）
     */
    private Integer deliveryMethod;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 订单是否有效
     */
    private Integer isDelete;

    /**
     * 订单下单时间
     */
    private Date orderCreateTime;
    /**
     * 支付确认时间
     */
    private Date paymentConfirmTime;

    /**
     * 出库时间（发码时间）
     */
    private Date orderOutboundTime;

    /**
     * 订单完成时间
     */
    private Date orderCompleteTime;

    /**
     * 关单时间
     */
    private Date orderClosedTime;

    /**
     * 订单备注
     */
    private String orderRemark;

    /**
     * 订单金额
     */
    private BigDecimal orderSum;

    /**
     * 优惠总额
     */
    private BigDecimal couponSum;

    /**
     * 应付金额
     */
    private BigDecimal shouldPay;

    /**
     * 运费
     */
    private BigDecimal freightSum;
    /**
     * 尾款
     */
    private BigDecimal finalPay;
    /**
     * 下单账号
     */
    private Long userId;
    /**
     * 用户昵称
     */
    private String userName;
    /**
     * 订单来源 1 pc 2 m 3 app 4 wx
     */
    private String orderSource;

    /**
     * 外部订单号
     */
    private String externalOrderId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 退款状态
     */
    private Integer refundStatus;
    /**
     * 支付回调状态
     */
    private Integer payNotifyStatus;
    /**
     * 0 父单  1子单
     */
    private Integer subOrderType;

    /**
     * 商品总金额
     */
    private BigDecimal totalSum;

    /**
     * 父单id，若为父单为0，不拆分为null
     */
    private String parentOrderId;

    /**
     * 原始单号(提交订单时的单号)
     */
    private String originOrderId;
    /**
     * 支付交易的订单号
     */
    private String payTradeNo;
    /**
     * 收货地址id
     */
    private Integer addressId;

    /**
     * 业务线
     */
    private Integer businessId;

    /**
     * 评论状态，对应枚举 CommentStatusEnum
     */
    private Integer commentStatus;
}

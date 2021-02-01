package com.funny.trade.domain.order.entity;


import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderDataEntity extends BaseEntity {
    private static final long serialVersionUID = 1580961794650L;
    /**
    * 业务线 参考BusinessIdEnum
    */
    private Integer dbSource;


    /**
     * 数据来源
     */
    private Integer dataSource;

    private Integer businessId;
    /**
     * 生成订单的入口标识
     */
    private String orderRoute;

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
    * 支付类型
    */
    private Integer paymentType;

    /**
    * 订单状态
    */
    private Integer orderStatus;
    /**
     * 退款状态
     */
    private Integer refundStatus;

    /**
    * 订单下单时间
    */
    private Date orderCreateTime;

    /**
    * 订单过期时间
    */
    private Date expirationTime;

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
    * 订单标记
    */
    private String orderRemark;

    /**
    * 订单金额
    */
    private BigDecimal orderSum;

    /**
    * 商家优惠总额
    */
    private BigDecimal couponSum;
    /**
     * 商品总金额
     */
    private BigDecimal totalSum;
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
    * 订单来源，1：pc，2：m端等等
    */
    private String orderSource;

    /**
    * 外部订单号
    */
    private String externalOrderId;


    /**
    * 子单类型，父单为 0
    */
    private Integer subOrderType;

    /**
    * 父单id，若为父单为0，不拆分为null
    */
    private String parentOrderId;

    /**
    * 原始单号(提交订单时的单号)
    */
    private String originOrderId;

    /**
     * 客户姓名铭文
     */
    private String consName;

    private String consEmail;

    private String consEmailEncrypt;

    /**
    * {"describe":"顾客姓名_密文","En_Method":"公司统一","Hash":"cons_name_hash","owner":"魏玮"}
    */
    private String consNameEncrypt;

    /**
     * 客户地址铭文
     */
    private String consAddress;

    /**
    * {"describe":"地址_密文","En_Method":"公司统一","Hash":"cons_address_hash","owner":"魏玮"}
    */
    private String consAddressEncrypt;

    /**
     * 客户手机号的明文
     */
    private String consPhone;

    /**
    * {"describe":"手机号_密文","En_Method":"公司统一","Hash":"cons_phone_hash","owner":"魏玮"}
    */
    private String consPhoneEncrypt;

    /**
    * 顾客姓名_hash密文
    */
    private String consNameHash;

    /**
    * 地址_hash密文
    */
    private String consAddressHash;

    /**
    * 手机号_hash密文
    */
    private String consPhoneHash;

    /**
     * 身份证号明文
     */
    private String idCard;

    /**
    * 身份证号encrypt
    */
    private String idCardEncrypt;

    /**
    * 身份证号hash
    */
    private String idCardHash;

    /**
     * 下单账号
     */
    private Long userId;
    /**
     * 用户昵称
     */
    private String userName;
    /**
    * 发票ID
    */
    private Integer invoiceId;

    private Integer addressId;

    private Integer commentStatus;

    private Integer orderStatusNew;

    private Integer buyProvinceId;
    private Integer buyCityId;

}

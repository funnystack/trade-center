package com.funny.trade.domain.order.entity;


import com.funny.combo.core.base.BaseEntity;
import com.funny.combo.core.common.ApplicationContextHelper;
import com.funny.combo.extension.BizScenario;
import com.funny.combo.extension.ExtensionExecutor;
import com.funny.trade.domain.order.entity.valueobject.OrderItemEntity;
import com.funny.trade.domain.order.enums.OrderStatusEnum;
import com.funny.trade.domain.order.ext.OrderPayedStatusExtPt;
import lombok.Data;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDataEntity extends BaseEntity {
    private static final long serialVersionUID = 1580961794650L;
    /**
     * 业务线 参考BusinessIdEnum
     */
    private Integer dbSource;

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
     * 商家编号
     */
    private Integer sellerId;
    /**
     * 商家名称
     */
    private String sellerName;
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
    /**
     * 用户地址id
     */
    private Long addressId;
    /**
     * 订单备注
     */
    private String orderRemark;
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
    private Integer isDelete;

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
     * 订单评论状态
     */
    private Integer commentStatus;
    /**
     * 订单对外统一输出的状态
     */
    private Integer outOrderStatus;


    /**
     * 促销活动id
     */
    private Integer promotionId;
    /**
     * 阶梯购状态，null 非阶梯购，1 处理中，2 活动结束, 3支付时间大于活动结束时间、未支付、关单
     */
    private Integer ladderStatus;

    /**
     * 营销事件
     */
    private Integer holiday;

    /**
     * 营销事件场次id
     */
    private Integer processId;
    /**
     * 活动ID
     */
    private Integer activityId;
    /**
     * 团ID
     */
    private Integer groupId;

    /**
     * 活动类型（1拼团，2阶梯购）
     */
    private Integer activityType;

    /**
     * 活动状态（1活动进行中，2活动结束，成团，3活动结束，未成团，4参与无效）
     */
    private Integer activityStatus;

    /**
     * 活动退款标记（1,进行中和成团均不退;2,进行中不退,成团可退;3随时可退）
     */
    private Integer activityRefundFlag;

    private OrderExtEntity orderExtEntity;

    private List<OrderItemEntity> orderItemEntityList;

    private List<OrderOperateLogEntity> orderOperateLogEntity;

    @Resource
    private ExtensionExecutor extensionExecutor;

    public OrderDataEntity create() {
        setOrderStatus(OrderStatusEnum.WAIT_PAY.getKey());
        setIsDel(1);
        setRefundStatus(0);
        setOrderCreateTime(new Date());
        return this;
    }

    public OrderDataEntity payed() {
        ExtensionExecutor extensionExecutor = ApplicationContextHelper.getBean(ExtensionExecutor.class);
        return extensionExecutor.execute(OrderPayedStatusExtPt.class,BizScenario.valueOf(getDbSource() + "", getBusinessId() + "", getOrderRoute()),
                ex -> ex.updateOrderPayStatus(this));
    }

    public OrderDataEntity close() {
        setOrderStatus(OrderStatusEnum.CLOSED.getKey());
        setIsDel(1);
        setRefundStatus(0);
        return this;
    }
}

package com.funny.trade.domain.order.entity;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;


@Data
@Entity
public class OrderOuterInfoEntity extends BaseEntity {
    private static final long serialVersionUID = -8873802921372491082L;

    /**
     * 外部id
     */
    private Long outerId;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 名称
     */
    private String name;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 商品ID
     */
    private Long itemId;

    /**
     * 序列化的商品权益对象giftrights
     */
    private String desc;

    /**
     * 抵扣金额
     */
    private BigDecimal taxdeduct;

    /**
     * 关联order_item.extend_id
     */
    private Long extendId;

    /**
     * 操作标识 1：新增 2：修改，默认只修改
     */
    private Integer operType;

}

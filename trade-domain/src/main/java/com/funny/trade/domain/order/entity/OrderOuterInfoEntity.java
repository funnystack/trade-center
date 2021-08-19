package com.funny.trade.domain.order.entity;

import com.funny.combo.core.base.BaseEntity;
import com.funny.combo.core.ddd.annotion.Entity;
import com.funny.trade.domain.order.enums.OrderOuterInfoEnum;
import lombok.Data;


@Data
@Entity
public class OrderOuterInfoEntity extends BaseEntity {
    private static final long serialVersionUID = -8873802921372491082L;
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 类型
     * @see OrderOuterInfoEnum
     */
    private Integer outerType;

    /**
     * 名称
     * @see OrderOuterInfoEnum
     */
    private String name;
    /**
     * 存储扩展信息
     */
    private String extend;

}

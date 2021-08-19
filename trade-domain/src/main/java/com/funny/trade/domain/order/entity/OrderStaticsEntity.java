package com.funny.trade.domain.order.entity;


import com.funny.combo.core.base.BaseEntity;
import com.funny.combo.core.ddd.annotion.Entity;
import lombok.Data;

/**
 * 订单统计信息
 */
@Data
@Entity
public class OrderStaticsEntity extends BaseEntity {
    /**
     * 订单号
     */
    private String orderId;
    /**
     * cookie的里面信息
     */
    private String cookies;
    private Integer buyProvinceId;
    private Integer buyCityId;
    private Integer pvId;
    private Integer sourceId;
    private String sessionId;
    private String deviceId;
    private String cookieInfo;
}

package com.funny.trade.domain.coupon.entity;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

@Data
@Entity
public class CouponMappingScopeEntity extends BaseEntity {
    private static final long serialVersionUID = 1607184624054L;

    /**
    * 批次ID
    */
    private String batchId;

    /**
    * 使用规则Id
    */
    private Long mappingId;

    /**
    * 适用范围扩展配置JSON
    */
    private String scopeDetails;

}

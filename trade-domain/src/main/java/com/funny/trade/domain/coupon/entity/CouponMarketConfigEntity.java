package com.funny.trade.domain.coupon.entity;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

@Data
@Entity
public class CouponMarketConfigEntity extends BaseEntity {
    private static final long serialVersionUID = 1607184638715L;

    /**
    *
    */
    private Integer floorId;

    /**
    *
    */
    private String objectId;

    /**
    *
    */
    private Integer sortId;

}

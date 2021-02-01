package com.funny.trade.domain.coupon.entity;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

@Data
@Entity
public class CouponMarkEntity extends BaseEntity {
    private static final long serialVersionUID = 1607184634004L;

    /**
    * 批次ID
    */
    private String batchId;

    /**
    * 标记key
    */
    private String markKey;

    /**
    * 配置数据
    */
    private String markValue;

}

package com.funny.trade.domain.coupon.entity;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

import java.util.Date;
@Data
@Entity
public class CouponInfoEntity extends BaseEntity {
    private static final long serialVersionUID = 1607184612505L;

    /**
    * 批次ID
    */
    private String batchId;

    /**
    * 优惠券码
    */
    private String couponCode;

    /**
    * 外部券码
    */
    private String externalCode;

    /**
    * 1-未发放，2-已发放
    */
    private Integer grantStatus;

    /**
    * 发放时间
    */
    private Date grantTime;

}

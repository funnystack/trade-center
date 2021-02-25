package com.funny.trade.domain.coupon.entity;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

@Data
@Entity
public class CouponCodeDonateEntity extends BaseEntity {
    private static final long serialVersionUID = 1607184606891L;

    /**
    * 券码
    */
    private String codeNo;

    /**
    * 领取id
    */
    private String getId;

    /**
    * 批次id
    */
    private String batchId;

    /**
    * 用户ID
    */
    private String userId;

    /**
    * 用户手机号加密
    */
    private String bindPhone;
}

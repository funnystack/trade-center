package com.funny.trade.domain.coupon.entity;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

@Data
@Entity
public class CouponMappingTagEntity extends BaseEntity {
    private static final long serialVersionUID = 1607184629039L;

    /**
    * 标签名称
    */
    private String tagName;

}

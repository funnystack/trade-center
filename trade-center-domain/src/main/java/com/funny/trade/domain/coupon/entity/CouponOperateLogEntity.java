package com.funny.trade.domain.coupon.entity;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

@Data
@Entity
public class CouponOperateLogEntity extends BaseEntity {
    private static final long serialVersionUID = 1607184644249L;

    /**
    * 批次号
    */
    private String batchId;

    /**
    * 操作内容
    */
    private String content;

    /**
    * 操作人
    */
    private String operatePerson;

    /**
    * 操作类型(1,创建,2修改,3审核,4生成优惠券)
    */
    private Integer operateType;

    /**
    * 操作标识，1成功，2失败
    */
    private Integer operateFlag;

    /**
    * 服务器IP
    */
    private String serverIp;

    /**
    * 客户端IP
    */
    private String customerIp;

}

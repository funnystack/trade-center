package com.funny.trade.domain.order.entity;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

@Data
@Entity
public class OrderOperateLogEntity extends BaseEntity {
    private static final long serialVersionUID = 1589179307454L;

    /**
    * 订单号
    */
    private String orderId;

    /**
    * 日志内容
    */
    private String content;

    /**
    * 操作类型
    */
    private Integer operateType;

    /**
    * 操作标识，1成功，2失败
    */
    private Integer operateFlag;

    /**
    * 操作订单的系统唯一标识
    */
    private String systemId;

    /**
    *
    */
    private String systemIp;
    /**
     * 备注
     */
    private String remark;

}

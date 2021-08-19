package com.funny.trade.domain.order.entity;

import com.funny.combo.core.base.BaseEntity;
import com.funny.combo.core.ddd.annotion.Entity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class OrderMessageEventEntity extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1590848024820L;


    /**
    * 事件关联的id，如：订单号、报价单号等
    */
    private String orderId;

    /**
    * 消息事件类型，参考：OrderMsgEventEnum
    */
    private Integer eventType;

    /**
    * 消息终端类型：1 - 短信、2 - 商家后台通知、3 - 商家app通知、4 - 商家微信消息、5 - 运营微信消息
    */
    private Integer terminalType;

    /**
    * 事件名称
    */
    private String name;

    /**
    * 事件描述
    */
    private String desc;

    /**
    * 事件状态: 0 - 初始化，2 - 处理成功，3 - 处理失败
    */
    private Integer status;

    /**
    * 扩展字段
    */
    private String extend;

    /**
    * 失败次数
    */
    private Integer failCount;

    /**
    * 下一次重试开始时间
    */
    private Date nextExecuteStartTime;

}

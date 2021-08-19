package com.funny.trade.domain.order.entity;

import com.funny.combo.core.base.BaseEntity;
import com.funny.combo.core.ddd.annotion.Entity;
import com.funny.trade.domain.order.enums.OrderEventEnum;
import lombok.Data;

import java.util.Date;

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

    /**
     * 组装orderOperateLog
     */
    public static OrderOperateLogEntity buildOperateLog(String orderId, OrderEventEnum orderEventEnum,
                                                        Integer curStatus,Integer newStatus,
                                                        String opUser, int successFlag, String ip) {

        OrderOperateLogEntity opLog = new OrderOperateLogEntity();
        opLog.setOrderId(orderId);
        opLog.setOperateType(orderEventEnum.getKey());
        opLog.setOperateFlag(successFlag);// 1：成功，2：失败，没有意义，因为事务里写的，只有成功
        opLog.setSystemId(opUser);
        opLog.setSystemIp(ip);
        opLog.setGmtCreated(new Date());
        opLog.setGmtModified(new Date());
        StringBuffer content = new StringBuffer();
        content.append("操作类型：");
        content.append(OrderEventEnum.getName(orderEventEnum.getKey()));
        if (curStatus != null) {
            content.append("，当前状态：");
            content.append(curStatus);
        }
        if (newStatus != null) {
            content.append("，修改状态：");
            content.append(newStatus);
        }
        opLog.setContent(content.toString());
        return opLog;
    }
}

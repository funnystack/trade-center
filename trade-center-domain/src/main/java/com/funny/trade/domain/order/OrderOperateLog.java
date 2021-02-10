package com.funny.trade.domain.order;

import com.funny.trade.domain.order.entity.OrderOperateLogEntity;
import com.funny.trade.domain.order.enums.OperateUserTypeEnum;
import com.funny.trade.domain.order.enums.OrderEventEnum;
import org.apache.commons.lang3.StringUtils;

/**
 * 订单操作日志表
 */
public class OrderOperateLog extends OrderOperateLogEntity {
    /**
     * 组装orderOperateLog
     */
    public static OrderOperateLog buildOperateLog(String orderId, OrderEventEnum orderEventEnum, OperateUserTypeEnum operateUserTypeEnum, String opUser,
                                                  String curStatus, String newStatus) {

        OrderOperateLog opLog = new OrderOperateLog();
        opLog.setOrderId(orderId);
        opLog.setOperateType(orderEventEnum.getKey());
        opLog.setSystemId(opUser);

        StringBuffer content = new StringBuffer();
        content.append("操作类型：");
        content.append(OrderEventEnum.getName(orderEventEnum.getName()));
        if (StringUtils.isNotEmpty(curStatus)) {
            content.append("，当前状态：");
            content.append(curStatus);
        }
        if (StringUtils.isNotEmpty(newStatus)) {
            content.append("，修改状态：");
            content.append(newStatus);
        }
        opLog.setContent(content.toString());

        return opLog;
    }
}

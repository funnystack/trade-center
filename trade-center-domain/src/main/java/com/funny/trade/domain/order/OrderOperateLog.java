package com.funny.trade.domain.order;

import com.funny.trade.domain.order.entity.OrderOperateLogEntity;
import com.funny.trade.domain.order.enums.OrderOperateTypeEnum;
import org.apache.commons.lang3.StringUtils;

/**
 * 订单操作日志表
 */
public class OrderOperateLog extends OrderOperateLogEntity {
    /**
     * 组装orderOperateLog
     */
    public static OrderOperateLog buildOperateLog(String orderId, Integer opLogType, String curStatus, String newStatus,
                                                  String opUser, int successFlag, String ip) {

        OrderOperateLog opLog = new OrderOperateLog();
        opLog.setOrderId(orderId);
        opLog.setOperateType(opLogType);
        opLog.setOperateFlag(successFlag);// 1：成功，2：失败，没有意义，因为事务里写的，只有成功
        opLog.setSystemId(opUser);
        opLog.setSystemIp(ip);

        StringBuffer content = new StringBuffer();
        content.append("操作类型：");
        content.append(OrderOperateTypeEnum.getName(opLogType));
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

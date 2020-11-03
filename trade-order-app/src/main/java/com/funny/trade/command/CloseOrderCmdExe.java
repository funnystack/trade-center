package com.funny.trade.command;

import com.funny.combo.core.annotion.Command;
import com.funny.combo.core.command.CommandExecutorI;
import com.funny.combo.core.extension.BizScenario;
import com.funny.combo.core.extension.ExtensionExecutor;
import com.funny.combo.core.result.Response;
import com.funny.trade.domain.order.CloseOrderExtPt;
import com.funny.trade.domain.order.OrderDataEntity;
import com.funny.trade.dto.order.CloseOrderCmd;
import com.funny.trade.gatewayimpl.database.OrderDataMapper;

import javax.annotation.Resource;

@Command
public class CloseOrderCmdExe implements CommandExecutorI<Response, CloseOrderCmd> {

    @Resource
    private OrderDataMapper orderDataMapper;
    @Resource
    private ExtensionExecutor extensionExecutor;

    @Override
    public Response execute(CloseOrderCmd command) {

        OrderDataEntity orderDataEntity = new OrderDataEntity();
        command.setBizScenario(BizScenario.valueOf("travel","close_order","pay_timeout"));

        return extensionExecutor.execute(CloseOrderExtPt.class, command.getBizScenario(),
                ex -> ex.closeOrder(orderDataEntity));
    }
}

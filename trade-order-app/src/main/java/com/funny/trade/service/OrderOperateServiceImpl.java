package com.funny.trade.service;

import com.funny.combo.core.result.Response;
import com.funny.trade.api.order.OrderOperateService;
import com.funny.trade.command.CloseOrderCmdExe;
import com.funny.trade.dto.order.CloseOrderCmd;
import com.funny.trade.gatewayimpl.database.OrderDataMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderOperateServiceImpl implements OrderOperateService {

    @Resource
    private CloseOrderCmdExe closeOrderCmdExe;

    @Resource
    private OrderDataMapper orderDataMapper;


    @Override
    public Response closeOrder(CloseOrderCmd closeOrderCmd) {
//        OrderDataEntity orderDataEntity = orderDataMapper.findByOrderId(closeOrderCmd.getOrderId());

        return closeOrderCmdExe.execute(closeOrderCmd);
    }
}

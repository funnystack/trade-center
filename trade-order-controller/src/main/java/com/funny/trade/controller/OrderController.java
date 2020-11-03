package com.funny.trade.controller;

import com.funny.combo.core.result.Response;
import com.funny.trade.api.order.OrderOperateService;
import com.funny.trade.dto.order.CloseOrderCmd;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private OrderOperateService operateService;

    @GetMapping(value = "/close/order")
    public Response closeOrder(CloseOrderCmd closeOrderCmd){
        return operateService.closeOrder(closeOrderCmd);
    }
}

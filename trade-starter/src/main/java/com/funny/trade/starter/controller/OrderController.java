package com.funny.trade.starter.controller;

import com.funny.combo.core.result.SingleResponse;
import com.funny.trade.application.service.OrderApplicationService;
import com.funny.trade.client.dto.order.ReceiveOrderDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Created by funny on 2020-03-12.
 */
@RestController
public class OrderController {
    @Resource
    private OrderApplicationService orderApplicationService;

    @PostMapping("/order/receive")
    public SingleResponse receiveOrder(@RequestBody ReceiveOrderDTO receiveOrderDTO) {
        return orderApplicationService.receiveOrder(receiveOrderDTO);
    }

    @PostMapping("/order/payed")
    public SingleResponse payed(@RequestBody ReceiveOrderDTO receiveOrderDTO) {
        return orderApplicationService.payed(receiveOrderDTO);
    }

}

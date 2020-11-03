package com.funny.trade.service;

import com.funny.trade.api.order.OrderQueryService;
import com.funny.trade.domain.order.OrderDataEntity;
import com.funny.trade.dto.clientobject.OrderDataCO;
import com.funny.trade.dto.order.OrderGetQry;
import com.funny.trade.gatewayimpl.database.OrderDataMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderQueryServiceImpl implements OrderQueryService {

    @Resource
    private OrderDataMapper orderDataMapper;

    @Override
    public OrderDataCO getOrderDataByOrderId(OrderGetQry orderGetQry) {
        OrderDataEntity orderDataEntity = orderDataMapper.findByOrderId(orderGetQry.getOrderId());
        OrderDataCO orderDataCO = new OrderDataCO();
        BeanUtils.copyProperties(orderDataCO,orderDataEntity);
        return orderDataCO;
    }
}

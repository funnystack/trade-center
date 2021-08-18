package com.funny.trade.infra.persistence.impl;

import com.funny.trade.domain.order.entity.OrderDataEntity;
import com.funny.trade.domain.order.repository.OrderDataRepository;
import com.funny.trade.infra.persistence.mapper.order.OrderDataMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderDataRepositoryImpl implements OrderDataRepository {
    @Resource
    private OrderDataMapper orderDataMapper;

    @Override
    public int save(OrderDataEntity orderData) {
       return orderDataMapper.insertSelective(orderData);
    }

    @Override
    public int updateOrderStatus(OrderDataEntity orderData) {
        return orderDataMapper.updateOrderStatusByOrderId(orderData);
    }

    @Override
    public int updateOrderRemark(OrderDataEntity orderData) {
        return 0;
    }
}

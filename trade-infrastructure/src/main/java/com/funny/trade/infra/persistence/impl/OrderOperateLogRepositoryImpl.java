package com.funny.trade.infra.persistence.impl;

import com.funny.trade.domain.order.entity.OrderOperateLogEntity;
import com.funny.trade.domain.order.repository.OrderOperateLogRepository;
import com.funny.trade.infra.persistence.mapper.order.OrderOperateLogMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderOperateLogRepositoryImpl implements OrderOperateLogRepository {

    @Resource
    private OrderOperateLogMapper orderOperateLogMapper;

    @Override
    public void save(OrderOperateLogEntity orderOperateLogEntity) {
        orderOperateLogMapper.insertSelective(orderOperateLogEntity);
    }
}

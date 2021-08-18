package com.funny.trade.domain.order.repository;

import com.funny.trade.domain.order.entity.OrderOperateLogEntity;
import org.springframework.stereotype.Service;

@Service
public interface OrderOperateLogRepository {
    void save(OrderOperateLogEntity orderOperateLogEntity);
}

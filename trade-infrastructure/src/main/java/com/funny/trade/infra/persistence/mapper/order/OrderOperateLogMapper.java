package com.funny.trade.infra.persistence.mapper.order;

import com.funny.combo.core.base.BaseMapper;
import com.funny.trade.domain.order.entity.OrderOperateLogEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderOperateLogMapper extends BaseMapper<OrderOperateLogEntity> {

}

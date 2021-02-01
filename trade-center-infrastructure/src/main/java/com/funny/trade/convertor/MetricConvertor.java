package com.funny.trade.convertor;


import com.funny.trade.domain.order.entity.OrderDataEntity;
import com.funny.trade.gatewayimpl.database.dataobject.MetricDO;

/**
 * @author frankzhang
 */
public class MetricConvertor{

    public static MetricDO toDataObject(OrderDataEntity orderDataEntity){
        MetricDO metricDO = new MetricDO();
        return metricDO;
    }

}

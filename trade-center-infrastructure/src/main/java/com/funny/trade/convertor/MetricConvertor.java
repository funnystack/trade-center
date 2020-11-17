package com.funny.trade.convertor;


import com.funny.trade.domain.metrics.MetricItem;
import com.funny.trade.gatewayimpl.database.dataobject.MetricDO;

/**
 * @author frankzhang
 */
public class MetricConvertor{

    public static MetricDO toDataObject(MetricItem metricItem){
        MetricDO metricDO = new MetricDO();
        metricDO.setUserId(metricItem.getMetricOwner().getUserId());
        metricDO.setMainMetric(metricItem.getSubMetric().getParent().getCode());
        metricDO.setSubMetric(metricItem.getSubMetric().getCode());
        metricDO.setMetricItem(metricItem.toJsonString());
        return metricDO;
    }

}

package com.funny.trade.command.query;

import com.funny.trade.domain.metrics.SubMetricType;
import com.funny.trade.dto.ATAMetricQry;
import com.funny.trade.dto.clientobject.ATAMetricCO;
import com.funny.trade.gatewayimpl.database.MetricMapper;
import com.funny.trade.gatewayimpl.database.dataobject.MetricDO;
import com.alibaba.fastjson.JSON;
import com.funny.combo.core.result.MultiResponse;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class ATAMetricQryExe{

    @Resource
    private MetricMapper metricMapper;

    public MultiResponse<ATAMetricCO> execute(ATAMetricQry cmd) {
        List<MetricDO> metricDOList = metricMapper.listBySubMetric(cmd.getOwnerId(), SubMetricType.ATA.getMetricSubTypeCode());
        List<ATAMetricCO> ataMetricCOList = new ArrayList<>();
        metricDOList.forEach(metricDO -> {
            ATAMetricCO ataMetricCO = JSON.parseObject(metricDO.getMetricItem(), ATAMetricCO.class);
            ataMetricCO.setOwnerId(metricDO.getUserId());
            ataMetricCOList.add(ataMetricCO);
        });
        return MultiResponse.ofWithoutTotal(ataMetricCOList);
    }

}

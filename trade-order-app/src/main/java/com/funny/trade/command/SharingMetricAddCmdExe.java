package com.funny.trade.command;

import com.funny.trade.domain.gateway.MetricGateway;
import com.funny.trade.domain.metrics.techinfluence.InfluenceMetric;
import com.funny.trade.domain.metrics.techinfluence.SharingMetric;
import com.funny.trade.domain.metrics.techinfluence.SharingMetricItem;
import com.funny.trade.domain.metrics.techinfluence.SharingScope;
import com.funny.trade.domain.user.UserProfile;
import com.funny.trade.dto.SharingMetricAddCmd;
import com.funny.combo.core.result.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * SharingMetricAddCmdExe
 *
 * @author Frank Zhang
 * @date 2019-03-02 5:00 PM
 */
@Component
public class SharingMetricAddCmdExe{

    @Resource
    private MetricGateway metricGateway;

    public Response execute(SharingMetricAddCmd cmd) {
        SharingMetricItem sharingMetricItem = new SharingMetricItem();
        BeanUtils.copyProperties(cmd.getSharingMetricCO(), sharingMetricItem);
        sharingMetricItem.setSubMetric(new SharingMetric(new InfluenceMetric(new UserProfile(cmd.getSharingMetricCO().getOwnerId()))));
        sharingMetricItem.setSharingScope(SharingScope.valueOf(cmd.getSharingMetricCO().getSharingScope()));
        metricGateway.save(sharingMetricItem);
        return Response.buildSuccess();
    }
}

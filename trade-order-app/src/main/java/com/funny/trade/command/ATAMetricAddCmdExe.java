package com.funny.trade.command;

import com.funny.trade.domain.gateway.MetricGateway;
import com.funny.trade.domain.metrics.techinfluence.ATAMetric;
import com.funny.trade.domain.metrics.techinfluence.ATAMetricItem;
import com.funny.trade.domain.metrics.techinfluence.InfluenceMetric;
import com.funny.trade.domain.user.UserProfile;
import com.funny.trade.dto.ATAMetricAddCmd;
import com.funny.combo.core.result.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ATAMetricAddCmdExe
 *
 * @author Frank Zhang
 * @date 2019-03-01 11:42 AM
 */
@Component
public class ATAMetricAddCmdExe{

    @Autowired
    private MetricGateway metricGateway;

    public Response execute(ATAMetricAddCmd cmd) {
        ATAMetricItem ataMetricItem = new ATAMetricItem();
        BeanUtils.copyProperties(cmd.getAtaMetricCO(), ataMetricItem);
        ataMetricItem.setSubMetric(new ATAMetric(new InfluenceMetric(new UserProfile(cmd.getAtaMetricCO().getOwnerId()))));
        metricGateway.save(ataMetricItem);
        return Response.buildSuccess();
    }
}

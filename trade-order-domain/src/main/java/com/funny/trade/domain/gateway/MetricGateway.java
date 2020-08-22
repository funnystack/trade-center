package com.funny.trade.domain.gateway;

import com.funny.trade.domain.metrics.MetricItem;
import com.funny.trade.domain.metrics.SubMetric;
import com.funny.trade.domain.metrics.appquality.AppMetric;
import com.funny.trade.domain.metrics.devquality.BugMetric;

import java.util.List;

/**
 * MetricGateway
 *
 * @author Frank Zhang
 * @date 2020-07-02 12:16 PM
 */
public interface MetricGateway {
    void save(MetricItem metricItem);

    List<SubMetric> listByTechContribution(String userId);

    List<SubMetric> listByTechInfluence(String userId);

    BugMetric getBugMetric(String userId);

    AppMetric getAppMetric(String userId);
}

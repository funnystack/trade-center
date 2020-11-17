package com.funny.trade.domain.metrics.appquality;


import com.funny.trade.domain.metrics.MainMetric;
import com.funny.trade.domain.metrics.MainMetricType;
import com.funny.trade.domain.user.UserProfile;

public class AppQualityMetric extends MainMetric {

    private AppMetric appMetric;

    public AppQualityMetric(UserProfile metricOwner){
        this.metricOwner = metricOwner;
        metricOwner.setAppQualityMetric(this);
        this.metricMainType = MainMetricType.APP_QUALITY;
    }

    @Override
    public double getWeight() {
        return metricOwner.getWeight().getAppQualityWeight();
    }
}

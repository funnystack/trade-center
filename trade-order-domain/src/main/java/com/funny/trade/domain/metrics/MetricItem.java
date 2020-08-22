package com.funny.trade.domain.metrics;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.funny.combo.core.domain.EntityObject;
import com.funny.trade.domain.user.UserProfile;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MetricItem
 * 指标项，多个指标项可以构成一个指标
 * @author Frank Zhang
 * @date 2018-07-04 1:23 PM
 */
@Data
public abstract class MetricItem extends EntityObject implements Measurable{

    private static Logger logger = LoggerFactory.getLogger(MetricItem.class);

    /**
     * The metric this MetricItem belongs to
     */
    @JSONField(serialize = false)
    private SubMetric subMetric;

    /**
     * The owner of this MetricItem
     */
    @JSONField(serialize = false)
    private UserProfile metricOwner;

    public void setSubMetric(SubMetric subMetric){
        this.subMetric = subMetric;
        this.metricOwner = subMetric.getMetricOwner();
    }
    /**
     * 将度量项的转成JSON
     * @return
     */
    public String toJsonString() {
        String jsonStr = JSON.toJSONString(this, JSONPropertyFilter.singleton);
        logger.debug("\n From : " + this + " \n To: " + jsonStr);
        return jsonStr;
    }

}
package com.funny.trade.command;

import com.funny.trade.domain.gateway.MetricGateway;
import com.funny.trade.domain.metrics.techcontribution.CodeReviewMetric;
import com.funny.trade.domain.metrics.techcontribution.CodeReviewMetricItem;
import com.funny.trade.domain.metrics.techcontribution.ContributionMetric;
import com.funny.trade.domain.user.UserProfile;
import com.funny.trade.dto.CodeReviewMetricAddCmd;
import com.funny.combo.core.result.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * CodeReviewMetricAddCmdExe
 *
 * @author Frank Zhang
 * @date 2019-03-04 11:14 AM
 */
@Component
public class CodeReviewMetricAddCmdExe{

    @Autowired
    private MetricGateway metricGateway;

    public Response execute(CodeReviewMetricAddCmd cmd) {
        CodeReviewMetricItem codeReviewMetricItem = new CodeReviewMetricItem();
        BeanUtils.copyProperties(cmd, codeReviewMetricItem);
        codeReviewMetricItem.setSubMetric(new CodeReviewMetric(new ContributionMetric(new UserProfile(cmd.getOwnerId()))));
        metricGateway.save(codeReviewMetricItem);
        return Response.buildSuccess();
    }
}
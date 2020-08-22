package com.funny.trade.command;

import com.funny.trade.domain.gateway.MetricGateway;
import com.funny.trade.domain.metrics.techcontribution.ContributionMetric;
import com.funny.trade.domain.metrics.techcontribution.RefactoringLevel;
import com.funny.trade.domain.metrics.techcontribution.RefactoringMetric;
import com.funny.trade.domain.metrics.techcontribution.RefactoringMetricItem;
import com.funny.trade.domain.user.UserProfile;
import com.funny.trade.dto.RefactoringMetricAddCmd;
import com.funny.combo.core.result.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * RefactoringMetricAddCmdExe
 *
 * @author Frank Zhang
 * @date 2019-03-04 11:15 AM
 */
@Component
public class RefactoringMetricAddCmdExe{

    @Autowired
    private MetricGateway metricGateway;

    public Response execute(RefactoringMetricAddCmd cmd) {
        RefactoringMetricItem refactoringMetricItem = new RefactoringMetricItem();
        BeanUtils.copyProperties(cmd.getRefactoringMetricCO(), refactoringMetricItem);
        refactoringMetricItem.setSubMetric(new RefactoringMetric(new ContributionMetric(new UserProfile(cmd.getRefactoringMetricCO().getOwnerId()))));
        refactoringMetricItem.setRefactoringLevel(RefactoringLevel.valueOf(cmd.getRefactoringMetricCO().getRefactoringLevel()));
        metricGateway.save(refactoringMetricItem);
        return Response.buildSuccess();
    }
}

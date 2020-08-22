package com.funny.trade.api;

import com.funny.combo.core.result.MultiResponse;
import com.funny.combo.core.result.Response;
import com.funny.trade.dto.*;
import com.funny.trade.dto.clientobject.ATAMetricCO;

/**
 * MetricsServiceI
 *
 * @author Frank Zhang
 * @date 2019-03-01 10:06 AM
 */
public interface MetricsServiceI {
    Response addATAMetric(ATAMetricAddCmd cmd);

    Response addSharingMetric(SharingMetricAddCmd cmd);

    Response addPatentMetric(PatentMetricAddCmd cmd);

    Response addPaperMetric(PaperMetricAddCmd cmd);

    Response addRefactoringMetric(RefactoringMetricAddCmd cmd);

    Response addMiscMetric(MiscMetricAddCmd cmd);

    Response addCodeReviewMetric(CodeReviewMetricAddCmd cmd);

    Response deleteMetric(MetricDeleteCmd cmd);

    MultiResponse<ATAMetricCO> listATAMetrics(ATAMetricQry ataMetricQry);
}

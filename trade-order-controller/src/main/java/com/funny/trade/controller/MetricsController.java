package com.funny.trade.controller;

import com.funny.trade.api.MetricsServiceI;
import com.funny.trade.dto.ATAMetricAddCmd;
import com.funny.trade.dto.ATAMetricQry;
import com.funny.trade.dto.clientobject.ATAMetricCO;
import com.funny.combo.core.result.MultiResponse;
import com.funny.combo.core.result.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MetricsController {

    @Autowired
    private MetricsServiceI metricsService;

    @GetMapping(value = "/metrics/ata")
    public MultiResponse<ATAMetricCO> listATAMetrics(@RequestParam String ownerId){
        ATAMetricQry ataMetricQry = new ATAMetricQry();
        ataMetricQry.setOwnerId(ownerId);
        return metricsService.listATAMetrics(ataMetricQry);
    }

    @PostMapping(value = "/metrics/ata")
    public Response addATAMetric(@RequestBody ATAMetricAddCmd ataMetricAddCmd){
        return metricsService.addATAMetric(ataMetricAddCmd);
    }
}

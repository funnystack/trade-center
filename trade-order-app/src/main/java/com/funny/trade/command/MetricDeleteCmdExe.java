package com.funny.trade.command;

import com.funny.trade.dto.MetricDeleteCmd;
import com.funny.trade.gatewayimpl.database.MetricMapper;
import com.funny.combo.core.result.Response;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * MetricDeleteCmdExe
 *
 * @author Frank Zhang
 * @date 2019-03-04 3:01 PM
 */
@Component
public class MetricDeleteCmdExe{

    @Resource
    private MetricMapper metricMapper;

    public Response execute(MetricDeleteCmd cmd) {

        metricMapper.delete(cmd.getMetricId(), cmd.getOperater());

        return Response.buildSuccess();
    }
}
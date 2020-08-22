package com.funny.trade.event.handler;


import com.funny.trade.api.UserProfileServiceI;
import com.funny.trade.dto.RefreshScoreCmd;
import com.funny.trade.dto.domainevent.MetricItemCreatedEvent;
import com.funny.combo.core.annotion.EventHandler;
import com.funny.combo.core.event.EventHandlerI;
import com.funny.combo.core.result.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@EventHandler
public class MetricItemCreatedHandler implements EventHandlerI<Response, MetricItemCreatedEvent> {

    private Logger logger = LoggerFactory.getLogger(MetricItemCreatedHandler.class);

    @Autowired
    private UserProfileServiceI userProfileService;

    @Override
    public Response execute(MetricItemCreatedEvent event) {
        logger.debug("Handling Event: " + event);
        RefreshScoreCmd cmd = new RefreshScoreCmd(event.getUserId());
        userProfileService.refreshScore(cmd);
        return Response.buildSuccess();
    }
}

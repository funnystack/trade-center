package com.alibaba.craftsman.dto.domainevent;

import com.funny.combo.core.event.DomainEventI;
import lombok.Data;

@Data
public class MetricItemCreatedEvent implements DomainEventI {

    private String id;

    private String userId;

    private String mainMetricType;
}

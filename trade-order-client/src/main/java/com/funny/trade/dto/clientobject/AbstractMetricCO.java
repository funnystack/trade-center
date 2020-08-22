package com.funny.trade.dto.clientobject;

import com.funny.combo.core.dto.AbstractClient;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * AbstractMetricCO
 *
 * @author Frank Zhang
 * @date 2019-03-04 11:32 AM
 */
@Data
public abstract class AbstractMetricCO extends AbstractClient {
    /**
     * The ownerId of this Metric Item
     */
    @NotEmpty
    private String ownerId;
}

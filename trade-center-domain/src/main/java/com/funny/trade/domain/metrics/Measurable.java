package com.funny.trade.domain.metrics;

import java.io.Serializable;

/**
 * Measurable
 * 可度量的
 * @author Frank Zhang
 * @date 2018-07-04 1:32 PM
 */
public interface Measurable {

    /**
     * 计算分数
     * @return
     */
    double calculateScore();
}

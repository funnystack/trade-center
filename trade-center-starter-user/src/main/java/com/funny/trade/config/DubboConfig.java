package com.funny.trade.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * created by yaoyongbing on 2018/6/24
 * @author fangli
 */
@Configuration
@ImportResource("classpath:dubbo/*.xml")
public class DubboConfig {
}

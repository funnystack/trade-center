package com.funny.trade.starter;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Starter
 */
@SpringBootApplication(scanBasePackages = {"com.funny.trade", "com.funny.combo"})
@MapperScan("com.funny.trade.infra.database")
public class TradeStarterApplication {

    private static Logger logger = LoggerFactory.getLogger(TradeStarterApplication.class);

    public static void main(String[] args) {
        logger.info("Begin to start Spring Boot Application");
        long startTime = System.currentTimeMillis();

        SpringApplication.run(TradeStarterApplication.class, args);

        long endTime = System.currentTimeMillis();
        logger.info("End starting Spring Boot Application, Time used: " + (endTime - startTime));
    }
}

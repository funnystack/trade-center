package com.funny.trade.infra.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * 数据源配置工具类
 */
@Configuration
@MapperScan(basePackages = "com.funny.trade.infra.persistence.mapper", sqlSessionTemplateRef = "orderSqlSessionTemplate")
public class DataSourceOrderConfig {
    @Value("${spring.profiles.active}")
    private String profile;

    @Bean(name = "orderDataSource")
    @Qualifier("orderDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.druid.order")
    public DataSource userDataSource() {
        return new DruidDataSource();
    }

    @Bean(name = "orderTransactionManager")
    @Qualifier("orderTransactionManager")
    public DataSourceTransactionManager orderTransactionManager(@Qualifier("orderDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "orderSqlSessionFactory")
    @Qualifier("orderSqlSessionFactory")
    public SqlSessionFactory orderSqlSessionFactory(@Qualifier("orderDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/order/*.xml"));
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        if (profile.equalsIgnoreCase("dev")) {
            configuration.setLogImpl(StdOutImpl.class);
        }
        return bean.getObject();
    }

    @Bean(name = "orderSqlSessionTemplate")
    @Qualifier("orderSqlSessionTemplate")
    public SqlSessionTemplate orderSqlSessionTemplate(@Qualifier("orderSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}

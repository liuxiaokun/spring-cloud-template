package com.cloudoer.config.configzookeeper;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@SpringBootApplication
public class ConfigZookeeperApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigZookeeperApplication.class, args);
    }

    @Bean
    @RefreshScope
    public DataSource dataSource(Environment env) {

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        druidDataSource.setUrl(env.getProperty("spring.datasource.url"));
        druidDataSource.setUsername(env.getProperty("spring.datasource.username"));
        druidDataSource.setPassword(env.getProperty("spring.datasource.password"));
        druidDataSource.setInitialSize(2);
        druidDataSource.setMaxActive(160);
        druidDataSource.setMinIdle(0);
        druidDataSource.setMaxWait(60000);

        return druidDataSource;
    }
}

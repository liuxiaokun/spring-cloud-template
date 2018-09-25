package com.cloudoer.config.configzookeeper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxiaokun
 * @version 0.0.1
 * @since 2018/9/11
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${server.port}")
    private String value;

//    @Value("${server.port1}")
//    private String value1;

    @Autowired
    private User user;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("")
    public Object getConfig() {
        return value + " : " + user;
    }

    @GetMapping("jdbc")
    public Object testJdbc() {
        return jdbcTemplate.queryForObject("select count(*) from USER", Integer.class);
    }
}

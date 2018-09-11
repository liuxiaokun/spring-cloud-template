package com.cloudoer.config.configzookeeper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxiaokun
 * @version 0.0.1
 * @since 2018/9/11
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String value;

    @Value("${server.port1}")
    private String value1;

    @Autowired
    private User user;

    @GetMapping("")
    public Object getConfig() {
        return value + " : " + value1 + ":" + user;
    }
}

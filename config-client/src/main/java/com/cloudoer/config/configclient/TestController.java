package com.cloudoer.config.configclient;

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

    @Value("${foo}")
    private String foo;

    @GetMapping(value = "/hi")
    public String hi() {
        return foo;
    }
}

package com.cloudoer.eureka.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxiaokun
 * @version 0.0.1
 * @since 2018/9/10
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}

package com.cloudoer.eureka.eurekaclient;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        log.info("eureka client, name:{}, port:{}", name, port);
        return "eureka client, hi " + name + ",i am from port:" + port;
    }
}

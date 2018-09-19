package com.cloudoer.zipkin.zipkinservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author liuxiaokun
 * @version 0.0.1
 * @since 2018/9/19
 */
@RestController
@Slf4j
@Configuration
public class Controller {


    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/hi")
    public String callHome(){
        log.info("calling trace zipkin-service hi");
        return restTemplate.getForObject("http://localhost:8002/remote8002", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        log.info("calling trace zipkin-service info ");

        return "i'm zipkin-service";

    }

}

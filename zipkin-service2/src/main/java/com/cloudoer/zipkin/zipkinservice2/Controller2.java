package com.cloudoer.zipkin.zipkinservice2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
public class Controller2 {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/remote8002")
    public String info(){
        log.info("remote8002 ...");
//        return restTemplate.getForObject("http://localhost:8001/info",String.class);
        return "remote8002 ...";
    }

    @RequestMapping("/hi")
    public String hi2(){
        return "hi i'm 222222!";
    }
}

package com.cloudoer.eureka.eurekaribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author liuxiaokun
 * @version 0.0.1
 * @since 2018/9/10
 */
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/loadHi")
    @HystrixCommand(fallbackMethod = "hiError")
    public Object loadHi(@RequestParam String name) {

        return restTemplate.getForObject("http://service-fred/hi?name=" + name,
                String.class);
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }
}

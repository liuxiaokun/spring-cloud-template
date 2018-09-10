package com.cloudoer.eureka.eurekafeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxiaokun
 * @version 0.0.1
 * @since 2018/9/10
 */
@RestController
public class TestFeignController {

    @Autowired
    private FeignServiceHi feignServiceHi;

    @GetMapping("/feignHi")
    Object testFeign(String name){
        return feignServiceHi.sayHiFromClientOne(name);
    }
}

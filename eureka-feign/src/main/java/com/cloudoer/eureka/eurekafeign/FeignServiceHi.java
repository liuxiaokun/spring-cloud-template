package com.cloudoer.eureka.eurekafeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liuxiaokun
 * @version 0.0.1
 * @since 2018/9/10
 */
@FeignClient(value = "service-fred")
public interface FeignServiceHi {

    @GetMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

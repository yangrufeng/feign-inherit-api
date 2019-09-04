package com.yangrufeng.api;

import com.yangrufeng.dto.HouseInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "ribbon-eureka-demo")
public interface HouseRemoteClient {
    @GetMapping("/house/data")
    HouseInfo getData(@RequestParam("name") String name);
    @GetMapping("/house/data/{name}")
    String getData2(@PathVariable("name") String name);
    @PostMapping("/house/save")
    Long addData(@RequestBody HouseInfo houseInfo);
}


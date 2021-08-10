package com.komissarov.storefront.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client-store-service")
@Service
public interface EurekaFeignService {

    @RequestMapping("/showMessage")
    void showMessage();
}

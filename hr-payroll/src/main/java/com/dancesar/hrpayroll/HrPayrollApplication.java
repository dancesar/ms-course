package com.dancesar.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
//import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@LoadBalancerClient(name = "hr-worker")
//@RibbonClient(name = "hr-worker")
@EnableFeignClients
@SpringBootApplication
public class HrPayrollApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrPayrollApplication.class, args);
    }

}

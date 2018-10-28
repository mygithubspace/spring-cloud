package com.study.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author chengpeng
 * @create 2018-10-27 20:34
 */
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message) {
        return restTemplate.getForObject("http://SPRING-CLOUD-SERVICE-ADMIN/hi?message=" + message, String.class);
    }
    public String hiError(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}

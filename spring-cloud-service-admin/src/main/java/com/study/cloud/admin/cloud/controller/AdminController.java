package com.study.cloud.admin.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengpeng
 * @create 2018-10-27 17:50
 */
@RestController
public class AdminController {
    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public String sayHi(@RequestParam(value = "message")String message){
        return String.format("Hi,your message is : %s , I am from port is : %s",message,port);
    }
}

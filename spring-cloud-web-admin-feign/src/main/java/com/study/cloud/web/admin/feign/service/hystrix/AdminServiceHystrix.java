package com.study.cloud.web.admin.feign.service.hystrix;

import com.study.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @author chengpeng
 * @create 2018-10-27 19:22
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}

package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testinterceptor")
    public String testinterceptor(){
        System.out.println("testinterceptor执行了...");
        return "success";
    }
}

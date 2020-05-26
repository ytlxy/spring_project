package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class userController {
    @RequestMapping("/testException")
    public String testException(){
        System.out.println("testException执行了");
        int a = 10/0;
        return "success";
    }
}

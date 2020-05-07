package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//Controller控制器
@Controller
@RequestMapping(path = "/user")
public class hellocContoroller {
@RequestMapping(path = "/hello")
    public String sayhello(){
        System.out.println("hello spring");
        return "success";
    }
    @RequestMapping(path = "/testRequestMapping",params = {"username=li"},headers = {"Accept"})
    public String testRequestMapping(){
        System.out.println("测试");
        return "success";
    }
}

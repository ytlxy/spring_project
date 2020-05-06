package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Controller控制器
@Controller
public class hellocContoroller {
@RequestMapping(path="/hello")
    public String sayhello(){
        System.out.println("hello");
        return "success";
    }
}

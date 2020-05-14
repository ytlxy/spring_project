package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/anno")
public class AnnoController {
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(value = "name",required = false) String username){
        System.out.println("执行了:"+username);
        return "success";
    }
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody(required = false) String body){
        System.out.println("执行了:"+body);
        return "success";
    }
    @RequestMapping("/userPathVariable/{id}")
    public String userPathVariable(@PathVariable("id") Integer id){
        System.out.println(id);
        return "success";
    }
}

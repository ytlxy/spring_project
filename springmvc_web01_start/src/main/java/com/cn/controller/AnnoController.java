package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping("/testRequestheader")
    public String testRequestheader(@RequestHeader(value = "Accept-Language") String header){
        System.out.println("执行了:"+header);
        return "success";
    }
    @RequestMapping("/testcookieValue")
    public String testcookieValue(@CookieValue(value = "JSESSIONID") String cookicValue){
        System.out.println("执行了:"+cookicValue);
        return "success";
    }
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(){
        System.out.println("执行了");
        return "success";
    }
    @ModelAttribute
    public void showUser(){
        System.out.println("showUser执行了");
    }
}

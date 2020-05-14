package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller("sessionAttributeController")
@RequestMapping("/springmvcsession")
@SessionAttributes(value = {"username","password"},types = {Integer.class})
public class SessionAttributeController {
    @RequestMapping("testPut")
    public String testPot(Model model){
        model.addAttribute("username","张三");
        model.addAttribute("password","123123");
        model.addAttribute("hight",181);
        return "success";
    }
    @RequestMapping("testGet")
    public String testGet(ModelMap modelMap){
        System.out.println(modelMap.get("username")+"|"+modelMap.get("password")+"|"+modelMap.get("hight"));
        return "success";
    }
    @RequestMapping("complete")
    public String complete(SessionStatus status){
        status.setComplete();
        return "success";
    }
}

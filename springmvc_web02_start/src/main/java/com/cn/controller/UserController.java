package com.cn.controller;

import com.cn.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString执行了");
        User user=new User();
        user.setUsername("张三");
        user.setPassword("123465");
        user.setAge(22);
        model.addAttribute("user",user);
        return "success";
    }
    @RequestMapping("testVoid")
    public void testVoid(){
        System.out.println("testVoid执行了...");
    }
}

package com.cn.controller;

import com.cn.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping("/testParam")
    public String testParam(String username,int passwd){
        System.out.println("执行了"+username+"|"+passwd);
        return "success";
    }
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }
}
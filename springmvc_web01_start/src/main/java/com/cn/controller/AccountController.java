package com.cn.controller;

import com.cn.domain.Customers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("accountController")
@RequestMapping("/account")
public class AccountController {
    @RequestMapping("/findAccount")
    public String FindAccount(){
        System.out.println("查询账户");
        return "success";
    }
    @RequestMapping("/updataAccount")
    public String updataAccount(Customers customers){
        System.out.println("更新了账户|"+customers);
        return "success";
    }
}

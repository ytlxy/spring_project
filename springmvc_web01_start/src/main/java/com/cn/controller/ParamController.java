package com.cn.controller;

import com.cn.domain.Account;
import com.cn.domain.Paramtesr;
import com.cn.domain.User;
import org.omg.IOP.ServiceContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
    @RequestMapping("/saveParamtest")
    public String saveParamtest(Paramtesr paramtesr){
        System.out.println("执行了。。");
        System.out.println(paramtesr);
        return "success";
    }
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println(user);
        return "success";
    }
    @RequestMapping("testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("执行了"+request);
        HttpSession session=request.getSession();
        System.out.println(session);
        ServletContext serviceContext=session.getServletContext();
        System.out.println(serviceContext);
        System.out.println(response);
        return "success";
    }
}
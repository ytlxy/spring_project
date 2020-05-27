package com.cn.controller;

import com.cn.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class userController {
    @RequestMapping("/testException")
    public String testException() throws SysException {
        System.out.println("testException执行了");
        try {
            int a = 10/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("查询出错");
        }
        return "success";
    }
}

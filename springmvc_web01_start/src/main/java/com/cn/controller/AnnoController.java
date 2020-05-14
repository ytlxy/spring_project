package com.cn.controller;

import com.cn.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"})
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
    public String testModelAttribute(User user){
        System.out.println("执行了");
        System.out.println(user);
        return "success";
    }
//    @ModelAttribute
//    public User showUser(String uname){
//        System.out.println("showUser执行了");
//        User user=new User();
//        user.setUname(uname);
//        user.setAge(22);
//        user.setData(new Date());
//        return user;
//    }
    @RequestMapping("/testModelAttributeSnd")
    public String testModelAttributeSnd(@ModelAttribute("abc") User user){
        System.out.println("执行了snd");
        System.out.println(user);
        return "success";
    }
    @ModelAttribute
    public void showUserSnd(String uname, Map<String,User> map){
        System.out.println("showUsersnd执行了");
        User user=new User();
        user.setUname(uname);
        user.setAge(22);
        user.setData(new Date());
        map.put("abc",user);
    }
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("testSessionAttributes");
        model.addAttribute("msg","传入message");
        return "result";
    }
    @RequestMapping("/getSessionAttribute")
    public String getSessionAttribute(ModelMap modelMap){
        System.out.println("getSessionAttribute...");
        String a= (String) modelMap.get("msg");
        System.out.println(a);
        return "result";
    }
    @RequestMapping("/delSessionAttribute")
    public String delSessionAttribute(SessionStatus status){
        System.out.println("delSessionAttribute...");
        status.setComplete();
        return "result";
    }
}
package com.cn.controller;

import com.cn.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString执行了...");
        User user=new User();
        user.setUsername("张三");
        user.setPassword("123465");
        user.setAge(22);
        model.addAttribute("user",user);
        return "success";
    }
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("testVoid执行了...");
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
    }

    /**
     * 转发到indes.jsp
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/testVoidSend")
    public void testVoidSend(HttpServletRequest request,HttpServletResponse response) throws Exception {
        System.out.println("testVoidSend执行了...");
        response.sendRedirect(request.getContextPath()+"/index.jsp");
    }

    /**
     * 页面输出
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/testVoidAnswer")
    public void testVoidAnswer(HttpServletRequest request,HttpServletResponse response) throws Exception {
        System.out.println("testVoidAnswer执行了...");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html:charset=UTF-8");
        response.getWriter().print("123456");
    }
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mv=new ModelAndView();
        System.out.println("testModelAndView执行了...");
        User user=new User();
        user.setUsername("往往");
        user.setPassword("52531");
        user.setAge(22);
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        System.out.println("findAll执行了...");
        ModelAndView mv=new ModelAndView();
        mv.setViewName("list");
        List<User> users=new ArrayList<>();
        User user1=new User();
        user1.setUsername("张三");
        user1.setPassword("123");
        User user2=new User();
        user2.setUsername("照视");
        user2.setPassword("556");
        users.add(user1);
        users.add(user2);
        mv.addObject("users",users);
        return mv;
    }
    @RequestMapping("/testForwardAndRedirect")
    public String testForwardAndRedirect(){
        System.out.println("testForwardAndRedirect执行了");
//        return "forward:/WEB-INF/pages/success.jsp";
        return "redirect:/index.jsp";
    }
    @RequestMapping("/testAjax")
    public @ResponseBody User/*void*/ testAjax(@RequestBody /*String body*/ User user){
        System.out.println("testAjax执行了");
        System.out.println(user);
//        System.out.println(body);
        user.setUsername("马总");
        user.setAge(32);
        return user;
    }
}

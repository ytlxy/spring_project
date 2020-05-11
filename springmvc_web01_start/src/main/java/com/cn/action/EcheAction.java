package com.cn.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pages/message/*")
public class EcheAction {
//    @RequestMapping(value = "inputTest",method = RequestMethod.GET)
    @GetMapping("input")
    public String inputTest(){
        return "input";
    }
//    @RequestMapping(value = "echo",method = RequestMethod.GET)
    @GetMapping("echo")
    public ModelAndView echo(String msg){
        ModelAndView mav=new ModelAndView("show");
        mav.addObject("echoMessage","[echo]:"+"["+msg+"]");
        System.out.println(mav);
        return mav;
    }
}
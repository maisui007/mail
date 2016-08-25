package com.mail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hnair20160706 on 2016/8/1.
 */
@Controller
public class IndexController {
    @RequestMapping("/show")
    public String showIndex(){
        System.out.println("............");
        return "test";
    }
//    @RequestMapping("index")
//    public String index(){
//        System.out.println("根据servlet,决定跳转到哪种视图");
//        return "index";
//    }
//    @RequestMapping("/")
//    public ModelAndView mailIndex(){
//        System.out.println("根据servlet,[mailIndex()]决定跳转到哪种视图");
//        return new ModelAndView("index");
//
//    }

    @RequestMapping("/")
    public String mailIndex(){
        System.out.println("根据servlet,[mailIndex()]决定跳转到哪种视图");
        return "index.....";

    }
}

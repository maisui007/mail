package com.mail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hnair20160706 on 2016/8/1.
 */
@Controller
public class IndexController {
    @RequestMapping("/show")
    public String showIndex(){
        System.out.println("............");
        return "index";
    }
}

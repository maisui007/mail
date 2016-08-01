package com.mail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hnair20160706 on 2016/8/1.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("/index.htm")
    public String showIndex(){
        return "index";
    }
}

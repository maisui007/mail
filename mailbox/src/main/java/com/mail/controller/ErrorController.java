package com.mail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hnair20160706 on 2016/8/25.
 */
@Controller
public class ErrorController {
    @RequestMapping("500")
    public String error(){
        return "www/500";
    }
}

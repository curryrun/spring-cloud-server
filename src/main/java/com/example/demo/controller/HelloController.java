package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zdr on 2017/9/28.
 */
@Controller
public class HelloController {
    
    @RequestMapping("/getOne")
    @ResponseBody
    public String getOne(){
        return "Hello world";
    }
}

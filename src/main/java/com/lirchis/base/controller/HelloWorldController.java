package com.lirchis.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello_world")
public class HelloWorldController {
    @RequestMapping("/print")
    @ResponseBody
    public String print(){
        return "HelloWorld";
    }
}

package com.rp.testmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class DemoController {

    @RequestMapping
    public String test(){
        return "访问成功";
    }
}

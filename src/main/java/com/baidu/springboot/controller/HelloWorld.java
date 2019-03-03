package com.baidu.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resources;

@RestController
public class HelloWorld {

    @Value("${msg}")
    public String msg;
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("msg");
        System.out.println();
        return this.msg;
    }



}

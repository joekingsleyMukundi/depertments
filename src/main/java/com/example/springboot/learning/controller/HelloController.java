package com.example.springboot.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //@RequestMapping(value = "/", method = RequestMethod.GET) or
    @GetMapping("/")
    public  String helloWorld(){
        return  "welcome to e-hoomes!!!! Yow its joe";
    }
}

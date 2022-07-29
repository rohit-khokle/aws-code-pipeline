package com.sampleproject.demo;


import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping({"/v1/demo"})
public class DemoController {

    @GetMapping("/hello")
    public String hello(){
        return "Hi from Project - v4";
    }
}

package com.sampleproject.demo;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/demo"})
public class DemoController {

    @GetMapping("/hello")
    public String hello(){
        return "Hi from Project - v5";
    }
}

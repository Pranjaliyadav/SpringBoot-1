package com.udemyJavaCourse.springboot.demo.springBootTest1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//this is how you declare Rest API usage
@RestController
public class FirstController {

    //like @Get of js. for get calls.
    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }

}

package com.mySpringApp.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/get_hello")
    String getHello() {
        return "hi there";
    }

    @PostMapping("/post_hello")
    String postHello() {
        return "hi there";
    }

}

package com.springcloud.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: hello
 * @description:
 * @author: Mr.Wang
 * @create: 2021-06-15 13:49
 **/

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello spring cloud";
    }
}

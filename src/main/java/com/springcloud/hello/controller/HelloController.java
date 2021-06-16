package com.springcloud.hello.controller;

import org.springframework.beans.factory.annotation.Value;
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

    @Value("${server.port}")
    private String port;
    @GetMapping("/hello")
    public String hello() {
        return "hello spring cloud 我是："+this.port;
    }
}

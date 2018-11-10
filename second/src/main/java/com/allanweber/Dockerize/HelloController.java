package com.allanweber.Dockerize;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;
import java.net.UnknownHostException;

@RestController
public class HelloController {

    @GetMapping
    public final String hello() throws UnknownHostException {
        return "Hello, I am at " + Inet4Address.getLocalHost().getHostAddress();
    }

}

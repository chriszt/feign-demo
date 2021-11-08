package com.example.srv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SrvApplication {

    @RequestMapping("/index")
    @ResponseBody
    public String index(String name) {
        System.out.println("Hello " + name);
        return "Hello " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(SrvApplication.class, args);
    }

}

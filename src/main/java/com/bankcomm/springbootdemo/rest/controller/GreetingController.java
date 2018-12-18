package com.bankcomm.springbootdemo.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.concurrent.atomic.AtomicLong;
import com.bankcomm.springbootdemo.entity.*;

@Controller
@RequestMapping("/greetingController")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @ResponseBody
    @RequestMapping("/hello")
    public String greeting() {
        return "111";
    }

    @ResponseBody
    @RequestMapping("/greeting2")
    public Greeting greeting2(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

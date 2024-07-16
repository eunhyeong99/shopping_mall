package com.example.prac_shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/")
    @ResponseBody
    String hello() {
        return "hello";
    }

    @GetMapping("*")
    String error() {
        return "redirect:/";
    }
}
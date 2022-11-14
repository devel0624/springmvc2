package com.nhnacademy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NowController {
    @GetMapping("/now")
    public String now() {
        return "now";
    }
}
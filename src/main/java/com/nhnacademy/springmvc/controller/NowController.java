package com.nhnacademy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NowController {
    @GetMapping("/now")
    public String now() {
        return "now";
    }

    @GetMapping("/now2")
    public ModelAndView doSomething() {
        ModelAndView mav = new ModelAndView("viewName");
        mav.addObject("name", "value");
        // ...

        return mav;
    }
}
package com.zhihu.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewIndexController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}

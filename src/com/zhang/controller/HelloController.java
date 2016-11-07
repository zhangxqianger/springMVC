package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/11/7.
 */
@Controller
public class HelloController {
    @RequestMapping("index")
    public String hello() {
        return "index";
    }
}

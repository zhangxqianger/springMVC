package com.zhang.controller;

import com.zhang.bean.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/11/8.
 */
@Controller
public class DatabindController {
    @RequestMapping("databind")
    public String getMes(@ModelAttribute("msg") String msg, DemoObj demoObj) {
        System.out.println(msg);
        throw new IllegalArgumentException("主动抛出的异常： " + msg);
    }
}

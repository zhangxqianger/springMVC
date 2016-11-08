package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/11/8.
 */
@Controller
public class SSEController {
    @RequestMapping(value = "push", produces = "text/event-stream;charset-utf-8")
    public
    @ResponseBody
    String push(@ModelAttribute("msg") String msg) {
        return "data:" + System.currentTimeMillis() + "\n\n";
    }
}

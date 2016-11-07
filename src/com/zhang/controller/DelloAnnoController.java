package com.zhang.controller;

import com.zhang.bean.DemoObj;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/11/7.
 */
@RestController
@RequestMapping("/anno")
public class DelloAnnoController {
    @RequestMapping(produces = "text/plain;charset=utf-8")
    public
    @ResponseBody
    String index(HttpServletRequest request) {
        return "url" + request.getRequestURI() + "can access";
    }

    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=utf-8")
    public
    @ResponseBody
    String demoPathvar(@PathVariable String str, HttpServletRequest request) {
        return "url" + request.getRequestURI() + " can access, str: " + str;
    }

    @RequestMapping(value = "/obj", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String passObj(DemoObj demoObj, HttpServletRequest request) {
        return "url:" + request.getRequestURI() + "can access, obj: " + demoObj.getId() + demoObj.getName();
    }

    @RequestMapping(value = "/demoObj/{id}/{name}/{age}", produces = "application/json;charset=utf-8")
    public DemoObj DemoObj(HttpServletRequest request,@PathVariable Long id, @PathVariable String name, @PathVariable Short age) {
        DemoObj demoObj = new DemoObj(id, name, age);
        System.out.println(request.getRequestURI());
        System.out.println(demoObj);
        return demoObj;
    }
}

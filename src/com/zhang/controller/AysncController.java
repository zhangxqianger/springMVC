package com.zhang.controller;

import com.zhang.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created by Administrator on 2016/11/8.
 */
@Controller
public class AysncController {
    @Autowired
    private PushService pushService;

    @RequestMapping("/defer")
    public @ResponseBody
    DeferredResult<String> deferredResult(@ModelAttribute("msg")String msg) {
        System.out.println(msg);
        return pushService.getAsyncUpdate();
    }
}

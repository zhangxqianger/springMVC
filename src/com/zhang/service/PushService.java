package com.zhang.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created by Administrator on 2016/11/8.
 */
@Service
public class PushService {
    private DeferredResult<String> deferredResult;

    public DeferredResult<String> getAsyncUpdate() {
        deferredResult = new DeferredResult<>();
        return deferredResult;
    }

    @Scheduled(fixedDelay = 5000)
    public void reflush() {
        System.out.println("进入reflush方法");
        if (deferredResult != null) {
            System.out.println("添加数据");
            deferredResult.setResult(Long.toString(System.currentTimeMillis()));
        }
    }
}

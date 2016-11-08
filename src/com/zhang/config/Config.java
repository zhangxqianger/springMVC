package com.zhang.config;

import com.zhang.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by Administrator on 2016/11/7.
 */
@Configuration
@EnableWebMvc
@EnableScheduling
@ComponentScan({"com.zhang.controller", "com.zhang.service"})
public class Config extends WebMvcConfigurerAdapter {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        System.out.println("注册视图解析器");
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver("/", ".jsp");
        return internalResourceViewResolver;
    }

    @Bean
    public MyInterceptor myInterceptor() {

        System.out.println("注册interceptor");
        return new MyInterceptor();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor());
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/async").setViewName("/async");
    }
}

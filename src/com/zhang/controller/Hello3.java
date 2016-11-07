package com.zhang.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2016/11/7.
 */
@WebServlet(value = "/hello3", initParams = @WebInitParam(name = "name", value = "java developer"))
public class Hello3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入");
        String name = getInitParameter("name");
        System.out.println("获取初始化参数：" + name);
    }
}

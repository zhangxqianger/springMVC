package com.zhang.init;

import com.zhang.config.Config;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by Administrator on 2016/11/7.
 */
public class WebInitalizer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(Config.class);
        annotationConfigWebApplicationContext.setServletContext(servletContext);

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(annotationConfigWebApplicationContext));
        dispatcher.addMapping("/");
        dispatcher.setLoadOnStartup(1);

        System.out.println("\t┌──────────────────┐");
        System.out.println("\t│                                    │");
        System.out.println("\t│                                    │");
        System.out.println("\t│                                    │");
        System.out.println("\t│servlet3.0 gogogo 加载配置完成！！！│");
        System.out.println("\t│                                    │");
        System.out.println("\t│                                    │");
        System.out.println("\t│                                    │");
        System.out.println("\t└──────────────────┘");
    }


}

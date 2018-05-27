package com.zpy.core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Execute {

    public static void main(String[] args){

        /*ApplicationContext context = new ClassPathXmlApplicationContext("content.xml");
        Tool tool=context.getBean("tool",Tool.class);
        tool.Use();*/
        //ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ZBeans beans= ctx.getBean(ZBeans.class);
        beans.Fun();
    }
}

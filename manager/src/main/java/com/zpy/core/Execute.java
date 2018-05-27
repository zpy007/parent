package com.zpy.core;

import com.zpy.util.Tool;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("content.xml");
        ZBeans beans=context.getBean("myexe",ZBeans.class);
        beans.Fun();
        Tool tool=new Tool();
        tool.Use();
    }
}

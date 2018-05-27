package com.zpy.core;

import com.zpy.util.Tool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {
    public static void main(String[] args){

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();

        Tool tool=new Tool();
        tool.Use();
    }
}

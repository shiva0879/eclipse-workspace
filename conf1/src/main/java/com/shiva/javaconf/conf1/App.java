package com.shiva.javaconf.conf1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(Appconfg.class);
               Emp emp=context.getBean("emp",Emp.class);
               System.out.println(emp);
               
    }
}

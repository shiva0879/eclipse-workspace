package com.shiva.test.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("connection-config.xml");
         
        App1 app1= context.getBean("app1",App1.class);
        app1.bill();
        
       Con1 con1 =context.getBean("con1",Con1.class);
       System.out.println(con1);
    		   
    }
}

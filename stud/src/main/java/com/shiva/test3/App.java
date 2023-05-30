package com.shiva.test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("connection-conf.xml");
         Student student= context.getBean("student",Student.class);
         System.out.println(student.getRollno()+""+student.getName());
         
         Marks marks=student.getMarks();
        		 System.out.println(marks.getMaths()+" "+marks.getScience()+" "+marks.getSanskrit());
        		 
         School school=student.getSchool();
         System.out.println(school.getSid()+" "+school.getSname()+" "+school.getSloca());
    }
}

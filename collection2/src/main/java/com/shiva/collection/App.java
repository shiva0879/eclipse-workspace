package com.shiva.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(Appconfg.class);
        Collection data= context.getBean("collection",Collection.class);
        data.getBook().forEach(b->System.out.println(b.getBid()+" "+b.getBname()+" "+b.getBauthor()));
        data.getCustm().forEach(c->System.out.println(c.getFname()+" "+c.getLname()+" "+c.getEmail()));
    }
}

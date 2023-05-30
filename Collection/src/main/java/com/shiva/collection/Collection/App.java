package com.shiva.collection.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(Appconfg.class);
        Collection collection=context.getBean("collection",Collection.class);
         collection.getCname().forEach(n->System.out.println(n));
         collection.getCid().forEach(id->System.out.println(id));
         collection.getCcount().forEach((k,v)->System.out.println(k+" "+v));
         }
}

package com.shiva.multiconf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(Appconf2.class);
         Veg veg=context.getBean("veg",Veg.class);
         veg.Veginfo();
          Nonveg non=context.getBean("non",Nonveg.class);
          non.Noninfo();
          Mix mix=context.getBean("mix",Mix.class);
          mix.Mixinfo();
    }
}

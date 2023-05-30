package com.shiva.javaconf1.javaconf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(Appconf.class);
              Product product= context.getBean("product",Product.class);
      System.out.println(product.getPid()+""+product.getPname());
      Mfg mfg=product.getMfg();
      System.out.println(mfg.getDate()+""+mfg.getMonths());
   Quntity q = product.getQuntity();
   System.out.println(q.getQuntity()+""+q.getSize());
      

    }   
}

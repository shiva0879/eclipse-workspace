package com.shiva.javaconf1.javaconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconf {
	@Bean
	public Mfg mfg() {
		Mfg mfg =new Mfg();
		mfg.setDate(6);
		mfg.setMonths("june");
		return mfg;
		
	}
	@Bean
	public Quntity quntity() {
		Quntity q=new Quntity();
		q.setQuntity(43);
		q.setSize(104);
		return q;
		
	}
	@Bean
	public Product product() {
		Product p = new Product();
		p.setPid(101);
		p.setPname("soap");
		p.setMfg(mfg());
		p.setQuntity(quntity());
		return p;
		
		
	}

}

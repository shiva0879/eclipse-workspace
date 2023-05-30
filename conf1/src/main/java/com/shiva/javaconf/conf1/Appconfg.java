package com.shiva.javaconf.conf1;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfg {
	@Bean
	public Emp emp() {
		return new Emp();
		
		
		

		
		
	}

	

}

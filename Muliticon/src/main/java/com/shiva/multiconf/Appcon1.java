package com.shiva.multiconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appcon1 {
	@Bean
	public Nonveg non() {
		return  new Nonveg();
		
	}

}


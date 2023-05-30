package com.shiva.multiconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {Appcon.class,Appcon1.class })
public class Appconf2 {
	@Bean
	public Mix mix() {
		return new Mix();
		
	}

}

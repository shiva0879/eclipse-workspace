package com.shiva.multiconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appcon {
	@Bean

	public Veg veg() {
		return new Veg();
	}
}

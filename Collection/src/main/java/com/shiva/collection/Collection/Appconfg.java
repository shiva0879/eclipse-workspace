package com.shiva.collection.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfg {
@Bean
public Collection collection() {
	Collection data= new Collection();
	data.setCname(Set.of("shiva","kumar","ramu"));
	data.setCid(List.of(500017,500018,5000019));
	data.setCcount( Map.of(3,"raj",4,"kumar",8,"pallakonda"));
	
	return data;
	
	
}

}

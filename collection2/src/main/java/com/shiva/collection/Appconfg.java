package com.shiva.collection;

import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfg {
@Bean
public Book book() {
	Book book=new Book();
	book.setBid(101);
	book.setBname("life is like death");
	book.setBauthor("shiva");
	return book;
}
@Bean
public Custm custm() {
	Custm c=new Custm();
	c.setFname("kumar");
	c.setLname("pallakonda");
	c.setEmail("shiva@123");
	return c;
	
}
@Bean
public Collection collection() {
	Collection collection=new Collection();
	collection.setBook(List.of(book()));
	collection.setCustm(Set.of(custm()));
	return collection;
	
	
}
}

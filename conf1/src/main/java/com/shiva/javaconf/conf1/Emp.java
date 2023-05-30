package com.shiva.javaconf.conf1;

import org.springframework.stereotype.Component;

@Component
public class Emp {
	public Emp(){
		System.out.println("Emp :: constructor");
		
	}
	public void Empinfo(){
		System.out.println("welcom to the party");
		
	}

}

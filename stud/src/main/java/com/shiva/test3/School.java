package com.shiva.test3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {
	@Value("20234")
	private int Sid;
	@Value("Nagarjuna high school")
	private String Sname;
	@Value("Rajeev nagar")
	private String sloca;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSloca() {
		return sloca;
	}
	public void setSloca(String sloca) {
		this.sloca = sloca;
	}

}


package com.shiva.javaconf1.javaconf;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
	
	private int  pid;
	private String pname;
	@Autowired
	private Quntity quntity;
	@Autowired
	private Mfg mfg;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Quntity getQuntity() {
		return quntity;
	}
	public void setQuntity(Quntity quntity) {
		this.quntity = quntity;
	}
	public Mfg getMfg() {
		return mfg;
	}
	public void setMfg(Mfg mfg) {
		this.mfg = mfg;
	}
	
	

}

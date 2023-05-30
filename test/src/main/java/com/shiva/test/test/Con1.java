package com.shiva.test.test;

public class Con1 {
	String fname;
	String lname;
	String email;
	long mobile;
	public Con1(String fname, String lname, String email, long mobile) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Con1 [fname=" + fname + ", lname=" + lname + ", email=" + email + ", mobile=" + mobile + "]";
	}
	

}

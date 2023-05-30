package com.shiva.test3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Marks {
	@Value("83")
	private double maths;
	@Value("74")
	private double science;
	@Value("71")
	private double sanskrit;
	public double getMaths() {
		return maths;
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	public double getScience() {
		return science;
	}
	public void setScience(double science) {
		this.science = science;
	}
	public double getSanskrit() {
		return sanskrit;
	}
	public void setSanskrit(double sanskrit) {
		this.sanskrit = sanskrit;
	}
	

}

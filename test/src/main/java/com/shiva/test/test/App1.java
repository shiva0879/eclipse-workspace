package com.shiva.test.test;

public class App1 {
	int id;
	String name;
	double cost;
	double quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public void bill() {
		 double  d1=cost*quantity;
		  System.out.println(d1);
	}
}

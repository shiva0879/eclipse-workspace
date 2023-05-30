package collectiontest;

import java.util.ArrayList;


public class Collectiontest1 {
	public static void main(String[] args) {
		ArrayList<Integer> fnumber=new ArrayList<Integer>();
		fnumber.add(2);
		fnumber.add(3);
		fnumber.add(4);
		fnumber.add(5);
		fnumber.add(8);
		System.out.println("first element"+fnumber.get(0));
		
		System.out.println("***************");
		
		//student names
		ArrayList<String> name=new ArrayList<String>();
		name.add("siva");
		name.add("shiva");
		name.add("shyam");
		name.add("sri");
		System.out.println("print all names"+name);
		
		System.out.println("***************");
		
		
		//use foreach loop
		ArrayList<String> fruit= new ArrayList<String>();
		fruit.add("grape");
		fruit.add("grape");
		fruit.add("grape");
		fruit.add("grape");
		for(String fruits : fruit) {
			System.out.println(fruits);
			
		
			
		}

	}
}
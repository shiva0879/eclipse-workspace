package collectiontest;

import java.util.ArrayList;

public class Primecollection {

	public static void main(String[] args) {
		ArrayList<Integer> fnumber=new ArrayList<Integer>();
		fnumber.add(2);
		fnumber.add(3);
		fnumber.add(5);
		fnumber.add(7);
		fnumber.add(11);
		System.out.println("first element"+fnumber.get(0));
		System.out.println("last element"+fnumber.get(fnumber.size()-1));
		System.out.println("third element"+fnumber.get(3));
		
		

	}

}

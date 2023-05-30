package collectiontest;

import java.util.ArrayList;

public class Amstrong {

	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(153);
		num.add(370);
		num.add(371);
		 boolean x=num.isEmpty();
		
		if(x==true) {
			System.out.println("the array list is empty");
		}
		else {
			System.out.println("array list is not empty");
		}
		num.clear();
		System.out.println("elements are cleared");

	}

}

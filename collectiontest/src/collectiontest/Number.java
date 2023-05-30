package collectiontest;

import java.util.ArrayList;

public class Number {

	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<>();
		num.add(3);
		num.add(5);
		num.add(8);
		num.add(9);
		num.add(6);
		num.add(7);
		System.out.println(num);
		num.add(11);
		num.remove(2);
		num.remove(3);
		num.set(3, 700);
		System.out.println(num);
		

	}

}

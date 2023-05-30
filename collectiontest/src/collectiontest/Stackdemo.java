package collectiontest;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		Stack<Integer> s= new Stack<>();
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		System.out.println(s);
		s.remove(3);
		System.out.println(s);
		
		System.out.println(s.search(3));
		s.pop();
		System.out.println(s);

	}

}

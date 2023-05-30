package collectiontest;

import java.util.ArrayList;

public class Evencoolection {

	public static void main(String[] args) {
	ArrayList<Integer> even=new ArrayList<Integer>();
	int i;
	for( i=1;i<=10;i++) {
		if(i%2==0) {
			even.add(i);
		}
		
		}
	for(Integer evens:even) {
		System.out.println(evens);
		
	}

	}

}

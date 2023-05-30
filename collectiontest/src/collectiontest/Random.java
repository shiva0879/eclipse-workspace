package collectiontest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Random {
	public static Integer findMin(List<Integer>number){
		if(number==null||number.size()==0) {
			return Integer.MAX_VALUE;
		}
		return Collections.min(number);
		}

	public static Integer findMax(List<Integer>number) {
		if(number==null||number.size()==0) {
			return Integer.MIN_VALUE;
		}
		return Collections.max(number);
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> num= new ArrayList<Integer>();
		num.add(3);
		num.add(9);
		num.add(5);
		num.add(1);
		num.add(8);
		num.add(7);
		System.out.println(num);
		
		System.out.println("min:"+findMin(num));
		System.out.println("max:"+findMax(num));
		
		
		
		
		
		
	}

}

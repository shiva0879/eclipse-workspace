package collectiontest;

import java.util.ArrayList;

public class Even {

	public static void main(String[] args) {
		ArrayList<Integer> num= new ArrayList<Integer>();
		num.add(2);
		num.add(4);
		num.add(6);
		num.add(8);
		int sum=0;
		for(int nums:num) {
			sum +=nums;
			
		}
		System.out.println(sum);
		
		int average=(sum/num.size());
		System.out.println("average"+average);

	}

}

package collectiontest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Arrayeven {

	public static void main(String[] args) {
		ArrayList<Integer>even=new ArrayList<>();
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
System.out.println(even);
LinkedList<Integer>odd=new LinkedList<>();
odd.add(1);
odd.add(3);
odd.add(5);
odd.add(7);
System.out.println(odd);
Vector<Integer> v=new Vector<>();
v.addAll(even);
v.addAll(odd);
for(Integer a:v) {
	System.out.println(a);
}


	}

}

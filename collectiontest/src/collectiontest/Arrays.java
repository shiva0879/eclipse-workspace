package collectiontest;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		List<String> laptop=new ArrayList<String>();
		laptop.add("lanvov");
		laptop.add("dell");
		laptop.add("hp");
		//array list format
		System.out.println(laptop);
		//array format
		for(String lap:laptop) {
			System.out.println(lap);
		}

	}

}

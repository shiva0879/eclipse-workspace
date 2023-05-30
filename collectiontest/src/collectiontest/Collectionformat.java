package collectiontest;

import java.util.Arrays;
import java.util.List;

public class Collectionformat {

	public static void main(String[] args) {
		 String[] names= {"ratan","anu","saravya"};
		 ///for compression
	System.out.println(Arrays.toString(names));
	 // by using aslist
	List<String> name=Arrays.asList(names);
	 System.out.println(name);
          
	}

}

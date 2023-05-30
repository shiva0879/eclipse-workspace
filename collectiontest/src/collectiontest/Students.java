package collectiontest;

import java.util.ArrayList;
import java.util.List;

public class Students {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("shiva");
		names.add("kumar");
		names.add("raj");
		names.add("siva");
		System.out.println(names);
		
		List<String> name=names.subList(1, 3);
		System.out.println("sub list 1-4 are"+name);
		

	}

}

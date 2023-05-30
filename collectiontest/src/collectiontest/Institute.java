package collectiontest;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class Institute {

	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
       name.add("shiva");
       name.add("sathya");
       name.add("evergreen");
       name.add("mahendra");
       
       Collections.reverse(name);
     System.out.println(name);
	}

}

package collectiontest;

import java.util.ArrayList;

import java.util.Collections;



public class Faculty {

	public static void main(String[] args) {
		ArrayList<String> name= new ArrayList<String>();
        name.add("ratan");
        name.add("aiva");
        name.add("shiva");
        name.add("kumar");
        name.add("mudra");
        Collections.sort(name);
        System.out.println(name);
        Collections.sort(name,Collections.reverseOrder());
        System.out.println(name);
	}

}

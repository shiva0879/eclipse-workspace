package collectiontest;

import java.util.ArrayList;

public class Searchcollection {

	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		name.add("shiva");
		name.add("kumar");
		name.add("ramu");
		name.add("raj");
		System.out.println(name);
		boolean x=name.contains("shi");
			if(x){
				System.out.println("element found");
			}
			else {
				System.out.println("element not found");
			}
		}
				
	}



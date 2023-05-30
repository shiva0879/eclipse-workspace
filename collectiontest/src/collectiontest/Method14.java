 package collectiontest;


import java.util.ArrayList;


public class Method14 {

	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<String>();
		s.add("shiva");
		s.add("kumar");
		s.add("pallakonda");
		System.out.println(s);
		DisplayMode(s);

	}

	private static void DisplayMode(ArrayList<String> s) {
		s.add("raj");
		System.out.println(s);
		
	}

	

}

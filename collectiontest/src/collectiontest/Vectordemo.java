package collectiontest;

import java.util.Vector;

public class Vectordemo
{

	public static void main(String[] args) {
		Vector<String> v= new Vector<>();
		v.add("shiva");
		v.add("kumar");
		v.add("pallakonda");
		v.add("bullet");
		System.out.println(v);
		for(int i=0;i<v.size();i++) {
			System.out.println(i+v.get(i));
		}
		

	}

}

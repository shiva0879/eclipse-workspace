package collectiontest;

import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		LinkedList<String> pet= new LinkedList<String>();
        pet.add("dog");
        pet.add("cat");
        pet.add("rat");
        pet.add("cow");
        System.out.println(pet);
        LinkedList<String> b= new LinkedList<String>(pet);
         System.out.println(b);
        LinkedList<String>a=new LinkedList<String>();
        for(String p:pet) {
        	a.add(p);
        	
        }
        System.out.println(a);
        LinkedList<String>c=new LinkedList<String>();
        c.addAll(a);
        System.out.println(a);

        
        
	}

}

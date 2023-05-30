package collectiontest;

import java.util.LinkedList;

public class Merging {

	public static void main(String[] args) {
		LinkedList<String> pet= new LinkedList<String>();
        pet.add("dog");
        pet.add("cat");
        pet.add("rat");
        pet.add("cow");
        System.out.println(pet);
       Object second=  new LinkedList<String>();
       second=pet.clone();
       System.out.println(second);
        
        
      
	}

}

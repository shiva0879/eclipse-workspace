package collectiontest;

import java.util.LinkedList;

public class Animals {

	public static void main(String[] args) {
		LinkedList<String> pet= new LinkedList<String>();
        pet.add("dog");
        pet.add("cat");
        pet.add("rat");
        pet.add("cow");
        System.out.println(pet);
        pet.removeFirst();
        pet.removeLast();
        System.out.println(pet);
      System.out.println(pet.getFirst());
      System.out.println(pet.getLast());
      
	}

}

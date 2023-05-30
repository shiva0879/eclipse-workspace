package collectiontest;

import java.util.ArrayList;

public class Vowelscollection {

	public static void main(String[] args) {
		ArrayList<Character> vowel= new ArrayList<Character>();
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		vowel.add('o');
		vowel.add('u');
		System.out.println(vowel);
    vowel.add(1, 'e');
    System.out.println(vowel);
    vowel.set(2, 'a');
    System.out.println(vowel);
    vowel.remove(0);
    System.out.println(vowel);
    vowel.remove(Character.valueOf('a'));
   System.out.println(vowel);
    
	}

}

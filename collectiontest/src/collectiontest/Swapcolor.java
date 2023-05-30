package collectiontest;

import java.util.ArrayList;
import java.util.Collections;

public class Swapcolor {

	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<String>();
		color.add("orange");
		color.add("red");
		color.add("blue");
		color.add("gray");
		color.add("green");
		System.out.println(color);
		//swap
		Collections.swap(color, 3, 1);
		System.out.println(color);
		//shuffle
		Collections.shuffle(color);
		System.out.println(color);

	}

}

package collectiontest;

import java.util.LinkedList;

public class Colours {

	public static void main(String[] args) {
		LinkedList<String> color=new LinkedList<String>();
        color.add("red");
        color.add("yellow");
        color.add("black");
        color.add("white");
        color.add("green");
        System.out.println(color);
        
        
        System.out.println(color.getFirst());
        System.out.println(color.getLast());
        color.set(3, "orange");
        System.out.println(color);
        color.removeFirst();
        System.out.println(color);
        		
	}

}

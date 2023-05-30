package collectiontest;


import java.util.ArrayList;
import java.util.Iterator;

public class Doubledemo {

	public static void main(String[] args) {
   ArrayList<Double> d=new ArrayList<>();
   d.add(3.3);
   d.add(5.5);
   d.add(3.2);
   d.add(6.7);
   d.add(4.8);
   d.add(4.3);
   Iterator<Double> l= d.iterator();
   while (l.hasNext()) {
	Double k =  l.next();{
		if(k<5) {
			l.remove();
		}
	}
	System.out.println(d);
}
   
    
    }

	
	


		
		

	}



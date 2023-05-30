package collectiontest;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Hospital {

	public static void main(String[] args) {
		Vector<String> hp=new Vector<>();
		hp.add("shiva");
		hp.add("ratan");
		hp.add("karthik");
		hp.add("prasuna");
		Enumeration<String>med=Collections.enumeration(hp); 
			while(med.hasMoreElements()) {
				System.out.println(med.nextElement());
				
			}
			
		}

	}



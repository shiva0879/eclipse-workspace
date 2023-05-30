package collectiontest;

import java.util.ArrayList;

public class Customer {

	public static void main(String[] args) {
		Customer1 n1= new Customer1(1, "shiva", 12233);
		Customer1 n2= new Customer1(2, "shiv", 2233);
		Customer1 n3= new Customer1(3, "shia", 1233);
		Customer1 n4= new Customer1(4, "shva", 1223);
        Customer1 n5= new Customer1(5, "siva", 12243);
        ArrayList<Customer1> a1= new ArrayList<Customer1>();
        a1.add(n1);
        a1.add(n2);
        ArrayList<Customer1> a2= new ArrayList<Customer1>();
        a2.add(n3);
        a2.add(n4);
        ArrayList<Customer1>a3=new ArrayList<Customer1>();
        a3.add(n5);
        a3.addAll(a1);
        a3.addAll(a2);
        
        for(Customer1 s:a3) {
        	System.out.println(s.id+s.name+s.phnum);
        }


	}

}

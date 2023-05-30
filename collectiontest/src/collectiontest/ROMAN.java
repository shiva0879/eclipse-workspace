package collectiontest;

import java.util.HashMap;
import java.util.Map;

public class ROMAN {
	public int romantoint(String s) {
	
	Map<Character, Integer> s1=new HashMap<Character, Integer>();
	s1.put('I',1);
	s1.put('V', 5);
	s1.put('X', 10);
	s1.put('L', 50);
	s1.put('C', 100);
	s1.put('D', 500);
	s1.put('M', 1000);
	
	int n=s.length();
	int num=s1.get(s.charAt(n-1));
	
	for(int i=n-2;i>=0;i--) {
		if(s1.get(s.charAt(i))>=s1.get(s.charAt(i+1))) {
			num =num+s1.get(s.charAt(i));
		}
		else {
			num =num-s1.get(s.charAt(i));
		}
		
	}
	System.out.println("The value of roman is : "+num);
	return num;
	}
	
	

}

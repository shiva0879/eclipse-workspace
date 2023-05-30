package collectiontest;

import java.util.LinkedList;

public class Product {
	public int pid;
	public String pname;
	public double pcost;
	public Product(int pid, String pname, double pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}
	public static  void main(String[] args) {
		//Product p=new Product(1, "vim", 23);
		LinkedList<Product> pro= new LinkedList<>();
		pro.add(new Product(1, "vim", 32));
		pro.add(new Product(2, "gel", 33));
		pro.add(new Product(3, "soap", 52));
		pro.add(new Product(4, "loop", 62));
		for(Product p:pro) {
			System.out.println(p.pid+p.pname+p.pcost);
		}
		
	}

}

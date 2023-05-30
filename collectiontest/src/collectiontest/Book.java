package collectiontest;

import java.util.ArrayList;


public class Book {

	public static void main(String[] args) {
		 
	 Book1 b1=new Book1(11, "Done with me", "shiva");
	 Book1 b2=new Book1(22, "At tobe done", "kumar");
	 Book1 b3=new Book1(33, "Raise like sun", "raj");
	 Book1 b4=new Book1(44, "Cool moon", "ramuk");
	 Book1 b5=new Book1(55, "Colapse", "avihs");
   ArrayList<Book1> books=new ArrayList<Book1>();
   books.add(b1);
   books.add(b2);
   books.add(b3);
   books.add(b4);
   books.add(b5);
   for(Book1 book:books) {
	   
	   System.out.println("book id"+" "+book.bookid+" "+"book name"+" "+book.bookname+" "+"book author"+" "+book.bookauthor);
       
   }
    Book1 b = books.get(2);
   System.out.println("specific object "+b.bookid+" "+b.bookname+" "+b.bookauthor);
  
	}

}

package com.shiva.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StudentDetails() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		//response.setContentType("text/html");
		String name =request.getParameter("name");
		int Rno= Integer.parseInt(request.getParameter("rollno"));
		int sub1= Integer.parseInt(request.getParameter("social"));
		int sub2= Integer.parseInt(request.getParameter("science"));
		int sub3= Integer.parseInt(request.getParameter("Maths"));
	    int total= sub1+sub2+sub3;
	    int avg= total/3;
	    writer.println(name);
	     writer.println(Rno);
	     writer.println(total);
	     writer.println(avg);
	  
	     if (avg>70 ) {
	    	 writer.println("grade A");
	     }
	     if(avg<60) {
	    	 writer.println("grade B");
	     }
	     if(avg<50) {
	    	 writer.println("grade C");
	     }
	    
	
	}

	

}

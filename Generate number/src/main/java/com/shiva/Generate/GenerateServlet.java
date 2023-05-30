package com.shiva.Generate;

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GenerateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public GenerateServlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter writer=response.getWriter();
	response.setContentType("text/plain");
	int first=Integer.parseInt(request.getParameter("firstname"));
	int second=Integer.parseInt(request.getParameter("secondname"));
	int sum=first+second;
	if(sum%2==0) {
		writer.println("even number"+sum);
	}


     
    
    		 }
    		 
    	 
     
     
	
}


		
			
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	


	
	


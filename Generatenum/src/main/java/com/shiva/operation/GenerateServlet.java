package com.shiva.operation;

import java.io.IOException;
import java.io.PrintWriter;

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
		//response.setContentType("text/html");
		
		int f1=Integer.parseInt(request.getParameter("firstnumber"));
		int f2=Integer.parseInt(request.getParameter("secondnumber"));
		int sum=f1+f2;
		if(sum%2==0) {
			writer.println(sum);
		}
		
		
	}


}

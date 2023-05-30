package com.shiva.fullname;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FullnameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public FullnameServlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter Writer=response.getWriter();
		response.setContentType("text/html");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		Writer.println("<html><body bgcolor=red; style=text-align:center;>");
		Writer.println("<h1>welcome's fullname</h1>");
		Writer.println("<p style='color:green'> your full nameis...</p> "+(firstname+lastname));
		Writer.println("</body></html>");
	}

	

}

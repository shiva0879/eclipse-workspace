package com.shiva.operators;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class OperatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public OperatorServlet() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter writer= response.getWriter();
		response.setContentType("text/html");
		int firstnumber=Integer.parseInt(request.getParameter("First  number"));
		int secondnumber=Integer.parseInt(request.getParameter("Second number"));
		String test=request.getParameter("test");
		writer.println("<html><body bgcolor='gray' style='text-align: center'>");
		if("add".equalsIgnoreCase(test)) {
			int add=firstnumber+secondnumber;
			RequestDispatcher dispatcher=request.getRequestDispatcher("Operators.html");
			dispatcher.include(request, response);
			writer.println("<h1>"+"sum of two number ="+" "+add+"</h1>");
		}
		else if("sub".equalsIgnoreCase(test)) {
			int sub=firstnumber-secondnumber;
			RequestDispatcher dispatcher=request.getRequestDispatcher("Operators.html");
			dispatcher.include(request, response);
			writer.println("<h1>different of two number="+" "+sub+"</h1>");
		}
		else if("mult".equalsIgnoreCase(test)) {
			int mult=firstnumber*secondnumber;
			RequestDispatcher dispatcher=request.getRequestDispatcher("Operators.html");
			dispatcher.include(request, response);
			writer.println("<h1>product of two number="+" "+mult+"</h1>");		}
		else if("div".equalsIgnoreCase(test)) {
			int div=firstnumber/secondnumber;
			RequestDispatcher dispatcher=request.getRequestDispatcher("Operators.html");
			dispatcher.include(request, response);
			writer.println("<h1>qutioent of two number="+" "+div+"</h1>");
		}
		else if("modulo".equalsIgnoreCase(test)) {
			int modulo=firstnumber%secondnumber;
			RequestDispatcher dispatcher=request.getRequestDispatcher("Operators.html");
			dispatcher.include(request, response);
			writer.println("<h1>modulo of two number="+" "+modulo+"</h1>");
		}
		writer.println("</body></html>");
		
	}

	

}

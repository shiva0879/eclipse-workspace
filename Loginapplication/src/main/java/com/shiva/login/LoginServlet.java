package com.shiva.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public LoginServlet() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter  Writer=response.getWriter();
		response.setContentType("text/html");
		
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		if(Username.equals("shiva")&&Password.equals("shiva@123")) {
			Writer.println("<html><body bgcolor=solidred>");
			Writer.println("<bgcolor='solidred'>login success....");
			Writer.println("</body></html>");
		}
		else {
			Writer.println("login fail....");
		}
	}

	

}

package com.prince;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String user=request.getParameter("username");
		String pwd=request.getParameter("userpass");
	PrintWriter pw=response.getWriter();
		if(user.equals("sathya"))
			if(pwd.equals("1234"))
				{
			pw.println("welcome to sathya");
				}
			else {
				pw.println("invalid user");
			}
   		
	}

}

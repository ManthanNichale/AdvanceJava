package com.techouts;
	
	import java.io.IOException;
	import java.io.PrintWriter;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;

	public class Demo1 extends HttpServlet {

	    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	       

	        int num1 = Integer.parseInt(req.getParameter("num1"));
	        int num2 = Integer.parseInt(req.getParameter("num2"));

	        int sum = num1 + num2;
	        PrintWriter out = res.getWriter();
	        out.println("<h2>Sum: " + sum + "</h2>");
	    }
	}



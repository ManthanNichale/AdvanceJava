package com.techouts;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/search")
public class Search extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

       // res.sendRedirect("https://www.google.com");
    	String search=req.getParameter("search");
    	res.sendRedirect("https://www.google.com/search?q="+search);
    	
    }
}
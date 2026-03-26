package com.techouts;


import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Addservlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
    
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        int sum = num1 + num2;
        req.setAttribute("sum", sum);
        RequestDispatcher rd = req.getRequestDispatcher("sq");
        rd.forward(req, res);
        

        res.getWriter().println("Result: " + sum );
        
    }
}

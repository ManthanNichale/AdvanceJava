package com.techouts;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Squre extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");

        // Get sum from request attribute
        int sum = (int) req.getAttribute("sum");

        // Calculate square
        int square = 2;

        // Display result
        res.getWriter().println("Square of Sum: " + square);
    }
}
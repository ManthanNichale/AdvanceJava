package com.techouts;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/submite")
public class Form extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {

        String name = req.getParameter("username");
        String password = req.getParameter("password");

        if ("manthan".equals(name) && "12345".equals(password)) {

            RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
            rd.forward(req, res);

        } else {

            RequestDispatcher rd = req.getRequestDispatcher("/error.jsp");
            rd.forward(req, res);
        }
    }
}
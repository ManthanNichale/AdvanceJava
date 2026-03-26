package com.techouts;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/myLogin")
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("username");
        String password = req.getParameter("password");

        res.setContentType("text/html");
System.out.println(name);
System.out.println(password);
        if ("manthan".equals(name) && "1234".equals(password)) {
            res.getWriter().println("<h2>Login Successful</h2>");
        } else {
            res.getWriter().println("<h2>Login Failed</h2>");
        }
    }
}
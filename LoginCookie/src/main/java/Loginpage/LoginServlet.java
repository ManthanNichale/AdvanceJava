package Loginpage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equals("Techouts") && password.equals("1234")) {
            // Create cookie
            Cookie userCookie = new Cookie("username", username);
            userCookie.setMaxAge(60*5); // 5 minutes
            response.addCookie(userCookie);

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h1>Login Successful</h1>");
            out.println("<a href='Logout'>Logout</a>");
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h1>Login Failed</h1>");
            out.println("<a href='login.jsp'>Try Again</a>");
        }
    }
}
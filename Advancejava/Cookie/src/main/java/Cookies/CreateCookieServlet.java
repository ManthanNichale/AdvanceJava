package Cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CreateCookie")
public class CreateCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        
        Cookie cookie = new Cookie("username", "Manthan Nichale"); // create cookie
        cookie.setMaxAge(60*5); // 5 minutes

        response.addCookie(cookie); // send to browser
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Cookie Created</h1>");
        out.println("<a href='ReadCookie'>Read Cookie</a>");
    }
}
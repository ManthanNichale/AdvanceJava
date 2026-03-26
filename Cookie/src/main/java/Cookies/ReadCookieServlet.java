package Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ReadCookie")
public class ReadCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        
        Cookie[] cookies = request.getCookies();
        String user = "Not Found";
        
        if(cookies != null){
            for(Cookie c : cookies){
                if(c.getName().equals("username")){
                    user = c.getValue();
                }
            }
        }
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Username: " + user + "</h1>");
    }
}
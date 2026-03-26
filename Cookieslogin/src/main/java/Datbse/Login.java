package Datbse;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/login") // ✅ Maps servlet without web.xml
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if("admin".equals(username) && "123".equals(password)) {

            // ✅ Session
            HttpSession session = request.getSession();
            session.setAttribute("user", username);

            // ✅ Cookie
            Cookie ck = new Cookie("user", username);
            ck.setMaxAge(60*60); // 1 hour
            response.addCookie(ck);

            // ✅ Redirect to welcome page
            response.sendRedirect("welcome.jsp");

        } else {
            out.println("<h3 style='color:red;'>Invalid Login!</h3>");
            out.println("<a href='login.jsp'>Try Again</a>");
        }
    }
}
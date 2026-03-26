package SessionTechniques;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/GetSession")
public class GetSessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get existing session (do not create new)
        HttpSession session = request.getSession(false);

        PrintWriter out = response.getWriter();

        if (session != null) {
            String username = (String) session.getAttribute("username");
            out.println("<h1>Welcome back, " + username + "</h1>");
        } else {
            out.println("<h1>Session expired or not found!</h1>");
        }
    }
}
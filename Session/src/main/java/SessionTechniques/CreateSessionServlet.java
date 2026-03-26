package SessionTechniques;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/CreateSession")
public class CreateSessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Create or get session
        HttpSession session = request.getSession();
        session.setAttribute("username", "Manthan");

        // Respond to client
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Session Created</h1>");
        out.println("<a href='GetSession'>Go to Next Page</a>");
    }
}
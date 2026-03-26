package DemoJsp;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//@WebServlet("JSTL")
public class JSTL extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = "manthan";

        request.setAttribute("label", name);

        RequestDispatcher rd = request.getRequestDispatcher("jstl.jsp");
        rd.forward(request, response);
    }
}
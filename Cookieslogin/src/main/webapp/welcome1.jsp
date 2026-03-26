import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
<%@ page import="javax.servlet.http.*, javax.servlet.*" %>

<html>
<head><title>Welcome</title></head>
<body>
<%
    String user = null;
    if(session != null) {
        user = (String) session.getAttribute("user");
    }

    if(user == null) {
        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
            for(Cookie c : cookies) {
                if("user".equals(c.getName())) {
                    user = c.getValue();
                    break;
                }
            }
        }
    }
%>

<% if(user != null) { %>
    <h2>Welcome, <%= user %>!</h2>
    <a href="logout.jsp">Logout</a>
<% } else { %>
    <h2>Please login first!</h2>
    <a href="login.jsp">Login</a>
<% } %>
</body>
</html>
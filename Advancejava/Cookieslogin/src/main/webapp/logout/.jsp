<%@ page import="javax.servlet.http.*, javax.servlet.*" %>
<html>
<head><title>Logout</title></head>
<body>
<%
    HttpSession session = request.getSession(false);
    if(session != null){
        session.invalidate();
    }

    Cookie ck = new Cookie("user", "");
    ck.setMaxAge(0);
    response.addCookie(ck);
%>
<h2>Logged out successfully!</h2>
<a href="login.jsp">Login Again</a>
</body>
</html>
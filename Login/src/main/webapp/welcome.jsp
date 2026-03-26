<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
This is manthan nichale  
From Telusko Learning  

<%
response.setHeader("Cache-Control","no-store,must-revalidate");

// Use the implicit session object provided by JSP
if (session == null || session.getAttribute("username") == null) {
	
   response.sendRedirect("login.jsp");
   
    return; // Stop executing the rest of the page
}
%>

Welcome <%= session.getAttribute("username") %>  

<a href="video.jsp">Videos here</a>

<form action="Logout">
 <input type="submit" value="Logout">
</form>

</body>
</html>
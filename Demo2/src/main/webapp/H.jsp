<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Hello JSP</h1>

<%!
int coef=3;
%>
<%
    out.println(2 + 4);
%>
My Fay Number  is :<%out.println(coef); %>

</body>

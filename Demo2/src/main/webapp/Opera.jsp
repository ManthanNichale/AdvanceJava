<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.Statement,java.util.Random,java.util.ArrayList" %>

<%@ include file="H.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red">
<% 
try
{ 
	int k=9/0;
}
catch(Exception e){

out.println(e);
}

%>
</body>
</html>
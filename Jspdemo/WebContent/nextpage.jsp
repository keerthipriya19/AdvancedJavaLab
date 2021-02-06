<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String color = request.getParameter("color");
%>
<body bgcolor = <%=color %>>
Selected color is: <%=color %>

</body>
</html>
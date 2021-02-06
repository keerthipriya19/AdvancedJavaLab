 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%!
ArrayList list = new ArrayList();
%>
<%
list.add("blue");
list.add("green");
list.add("black");
%>
<body>
<form action="./nextpage.jsp" method="get">
    Select a color:
    <select name="color">
    <%
        for(int i = 0; i < list.size(); i++) {
            String color = list.get(i).toString();
    %>
            <option value=<%=color%>> <%=color%> </option>
        <% } %>
    </select>
    <input name = "submit" type = "submit">
</form>
</body>
</html>
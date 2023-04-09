<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 09-04-2023
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Contact Page</h1>
<%
    String name = request.getAttribute("name").toString();
    Integer id = (Integer) request.getAttribute("no");
    List<String> list = (List<String>) request.getAttribute("frnd");
%>
<h1>Name is <%=name%></h1>
<h1>Id is <%=id%></h1>


<%
    for (String s:list) {
%>
  <h1><%=s%></h1>
<%
    }
  %>


</body>
</html>

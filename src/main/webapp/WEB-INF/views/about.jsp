<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 09-04-2023
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>About Page</h1>

<%

//    String name = request.getAttribute("name").toString();
//Integer id = (Integer) request.getAttribute("id");
//    LocalDateTime time = (LocalDateTime) request.getAttribute("time");

%>
<h1>My name is
<%--        <%=name%>--%>
    ${name}
</h1>
<h1>My Id is
<%--        <%=id%>--%>
    ${id}
</h1>
<h1>My time is
<%--        <%=time%>--%>
    ${time}
</h1>
<hr>

<c:forEach var="item" items="${marks}">

    <h1>${item}</h1>

</c:forEach>

</body>
</html>

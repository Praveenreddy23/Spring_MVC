<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 09-04-2023
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
  <title>Congrats</title>
</head>
<body bgcolor="silver" text="#d2691e">
<center>
  <h1>${Author}</h1>
  <h2>${CodeIn}</h2>

  <hr style="color: deeppink">
  <h1>Congratulation Registration Successful!!!</h1>
  <h1>Welcome, ${user.userName}</h1>
  <h1>Your Email Address is ${user.userEmail}</h1>
  <h1>Your Password is ${user.userPassword} Try To Secure The Password!!!</h1>

</center>

</body>
</html>

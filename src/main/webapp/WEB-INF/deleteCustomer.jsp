<%--
  Created by IntelliJ IDEA.
  User: cecilie
  Date: 05/03/2020
  Time: 12.56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete customer</title>
</head>
<body>

<h1>The customer ${sessionScope.deleteEmail} has been deleted.</h1>

<form name="logOut" action="FrontController" method="POST">
    <input type="hidden" name="taget" value="logOut">
    <input type="submit" value="Log out">
</form>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: cecilie
  Date: 05/03/2020
  Time: 11.32
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee overwiew</title>
</head>
<body>
<h1>Employee overview: </h1>

<c:forEach var="element" items="${sessionScope.userEmails}">

    ${element}
    <br>


</c:forEach>

<p>Number of employees: ${sessionScope.userEmailCount}</p>


<form name="logOut" action="FrontController" method="POST">
    <input type="hidden" name="taget" value="logOut">
    <input type="submit" value="Log out">
</form>



</body>
</html>

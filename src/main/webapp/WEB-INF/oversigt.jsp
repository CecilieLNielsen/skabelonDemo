<%--
  Created by IntelliJ IDEA.
  User: cecilie
  Date: 04/03/2020
  Time: 12.48
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Costumer overview</title>
</head>
<body>
<h1>Costumer overview</h1>


<c:forEach var="element" items="${sessionScope.emails}">

    ${element}
    <br>


</c:forEach>

<p>Number of customers: ${sessionScope.emailCount}</p>


<form name="logOut" action="FrontController" method="POST">
    <input type="hidden" name="taget" value="logOut">
    <input type="submit" value="Log out">
</form>



</body>
</html>

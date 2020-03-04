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
    <title>Oversigt</title>
</head>
<body>
<h1>Brugeroversigt</h1>


<c:forEach var="element" items="${sessionScope.emails}">

    ${element}
    <br>


</c:forEach>

<p>Antal brugere: ${sessionScope.emailCount}</p>





</body>
</html>

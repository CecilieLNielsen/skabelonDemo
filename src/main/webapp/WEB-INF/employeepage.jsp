<%-- 
    Document   : employeepage.jsp
    Created on : Aug 24, 2017, 6:31:57 AM
    Author     : kasper
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee home page</title>
    </head>
    <body>
        

        <h1>Hello ${sessionScope.email} </h1>



        You are now logged in as a EMPLOYEE of our wonderful site.


        <br>
        <br>
        <br>
        <br>

        <h3>Here you can register a new employee:</h3>

        <td>
            <form name="createEmployee" action="FrontController" method="POST">
                <input type="hidden" name="taget" value="createEmployee">
                Email:<br>
                <input type="text" name="email">
                <br>
                Password:<br>
                <input type="password" name="password1">
                <br>
                Retype Password:<br>
                <input type="password" name="password2">
                <br>
                <input type="submit" value="Submit">
            </form>
        </td>

        <br>
        <br>
        <br>
        <br>



        <h3>Push the button down below to show employees: </h3>
        <form name="OversigtEmployee" action="FrontController" method="POST">
            <input type="hidden" name="taget" value="OversigtEmployee">

            <input type="submit" value="Show employees">
        </form>

        <br>
        <br>

        <h3>Delete customers here: </h3>

        <form name="deleteCustomer" action="FrontController" method="POST">
            <input type="hidden" name="taget" value="deleteCustomer">

            Write customers email:<br>
            <input type="text" name="email">
            <br>
            <input type="submit" value="Delete customer">
        </form>

        <br>
        <br>
        <br>

        <h3>Change/reset customers password here: </h3>

        <form name="changePasswordCustomer" action="FrontController" method="POST">
            <input type="hidden" name="taget" value="changePasswordCustomer">

            Write customers email:<br>
            <input type="text" name="email">

            <br>

            Write new password: <br>
            <input type="text" name="password1">

            <br>

            Retype new password: <br>
            <input type="text" name="password2">

            <br>

            <input type="submit" value="Change/reset password">

        </form>

            <br>
            <br>
            <br>

            <form name="logOut" action="FrontController" method="POST">
                <input type="hidden" name="taget" value="logOut">
            <input type="submit" value="Log out">
        </form>
    </body>
</html>

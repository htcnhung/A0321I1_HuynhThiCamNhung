<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/10/2021
  Time: 6:08 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/users?action=create">Add New User</a><br/>
        <a href="/users">List User</a><br/>
        <a href="/users?action=listUserByName">List User By Name</a>
    </h2>
</center>
<div align="center">
    <form method="get">
<%--        tạo cái param action--%>
        <input type="hidden" name="action" value="searchCountry"/>
        <table border="1" cellpadding="5">
            <caption>
                <h2>Search By Country</h2>
            </caption>
            <tr>
                <th>Country:</th>
                <td>
                    <input <c:if test = "${searchWord}">value="${searchWord}" </c:if> type="text" name="country" id="country" size="15"/>
                </td>

            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Search"/>
                </td>
            </tr>
        </table>
    </form>
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${listUser}">
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.email}"/></td>
                <td><c:out value="${user.country}"/></td>
                <td>
                    <a href="/users?action=edit&id=${user.id}">Edit</a>
                    <a href="/users?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>

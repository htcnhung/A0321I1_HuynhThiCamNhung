<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/11/2021
  Time: 7:45 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1>English-Vietnamese Dictionary</h1>
<form method="post" action="/result">
    <label>
        <input type="search" name="keyword" value="${key}">
    </label>
    <input type="submit" value="Search">
</form>

<c:if test="${message != null}">
    <c:choose>
        <c:when test="${message == 'exist'}">
            <h1>${key}</h1>
            <h1>-----------</h1>
            <h1>Meaning: ${word}</h1>

        </c:when>
        <c:otherwise>
            <h1>${message}</h1>
        </c:otherwise>
    </c:choose>
</c:if>


</body>
</html>

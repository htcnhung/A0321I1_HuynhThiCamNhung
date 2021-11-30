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
<body>
<h1>${key}</h1>
<h1>-----------:</h1>
<c:choose>
    <c:when test="${word != null}">
        <h1>Meaning: ${word}</h1>
    </c:when>
    <c:otherwise>
        <h1>Sorry, we not found "${key}" in dictionary!</h1>
    </c:otherwise>
</c:choose>
</body>
</body>
</html>

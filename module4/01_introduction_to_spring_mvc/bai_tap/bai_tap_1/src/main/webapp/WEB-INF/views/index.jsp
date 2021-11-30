<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/11/2021
  Time: 6:17 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Currency converter app</title>
</head>
<body>
<h1>Currency converter app</h1>
<form action="/changeMoney" method="post">
    <input type="number" name="usa" id="usa" value="${usa}"/>USA<br/>
    <input type="submit" value="Change">

</form>
<c:if test="${vnd > 0}">
    //Hỏi lại tutor điều kiện if này, bắt buộc phải bỏ điều kiện vào đúng không???
    <p>${usa} USA</p>
    <p> = </p>
    <p>${vnd} VND</p>
</c:if>
</body>
</html>

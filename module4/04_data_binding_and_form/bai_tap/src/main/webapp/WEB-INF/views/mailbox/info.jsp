<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/11/2021
  Time: 6:31 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infor</title>
</head>
<body>
<h2>Submitted Mailbox Information</h2>
<table>
    <tr>
        <td>Language :</td>
        <td>${languageList}</td>
    </tr>
    <tr>
        <td>Page size :</td>
        <td>${pageSizeList}</td>
    </tr>
    <tr>
        <td>Spam Size :</td>
        <td>${spamFilter}</td>
    </tr>
    <tr>
        <td>Signature :</td>
        <td>${signature}</td>
    </tr>
</table>
</body>
</html>
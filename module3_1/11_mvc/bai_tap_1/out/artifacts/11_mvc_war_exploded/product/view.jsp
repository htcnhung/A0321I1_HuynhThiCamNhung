<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/10/2021
  Time: 9:14 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<h1>View Product Information</h1>
<p>
    <a href="/products">Back to customer list</a>
</p>
<table>
    <tr>
        <td>Product Name: </td>
        <td>${requestScope["product"].getProductName()}</td>
    </tr>
    <tr>
        <td>Product Price: </td>
        <td>${requestScope["product"].getProductPrice()}</td>
    </tr>
    <tr>
        <td>Product Description: </td>
        <td>${requestScope["product"].getProductDescription()}</td>
    </tr>
    <tr>
        <td>Producer: </td>
        <td>${requestScope["product"].getProducer()}</td>
    </tr>
</table>
</body>
</html>

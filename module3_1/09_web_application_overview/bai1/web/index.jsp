<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/10/2021
  Time: 9:48 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Product Discount Calculator</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form method="post" action="/calculate">
  <label>Product Description: </label><br/>
  <input type="text" name="productDescription" placeholder="Nhập mô tả của sản phẩm"/><br/>
  <label>List Price: </label><br/>
  <input type="text" name="listPrice" placeholder="Nhập giá niêm yết của sản phẩm"/><br/>
  <label>Discount Percent: </label><br/>
  <input type="text" name="discountPercent" placeholder="Nhập tỷ lệ chiết khấu (phần trăm)" value="0%"/><br/>
  <input type = "submit" id = "submit" value = "Calculate Discount"/>
</form>
</body>
</html>

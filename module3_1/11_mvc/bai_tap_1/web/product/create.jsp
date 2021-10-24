<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/10/2021
  Time: 9:12 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Product</title>
</head>
<body>
<h1>Create New Product</h1>
<p><a href="/products">Back to menu</a> </p>
<form action="/products?action=create" method="post">
    <fieldset>
        <legend>Product Information</legend>
        <table>
            <tr>
                <td>Product Id</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>Product Name</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Product Price</td>
                <td><input type="text" name="price"></td>
            </tr>
            <tr>
                <td>Product Description</td>
                <td><input type="text" name="description"></td>
            </tr>
            <tr>
                <td>Producer</td>
                <td><input type="text" name="producer"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Add Product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>

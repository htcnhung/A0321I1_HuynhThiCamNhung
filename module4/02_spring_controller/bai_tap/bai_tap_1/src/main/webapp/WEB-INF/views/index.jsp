<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/11/2021
  Time: 7:15 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/save" method="post">
    <input type="checkbox" name="condiment" value="Lettuce">
    <label>Lettuce</label>
    <input type="checkbox" name="condiment" value="Tomato">
    <label>Tomato</label>
    <input type="checkbox" name="condiment" value="Mustard">
    <label>Mustard</label>
    <input type="checkbox" name="condiment" value="Sprouts">
    <label>Sprouts</label>
    <br/><input type="submit" value="Save">
</form>
${sandwich}
</body>
</html>

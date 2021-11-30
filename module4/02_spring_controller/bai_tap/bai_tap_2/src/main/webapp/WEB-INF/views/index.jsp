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
  <title>Calculator Programming</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculate" method="post">
  <input type="number" name="number1" required>
  <input type="number" name="number2" required><br/>
  <button type="submit" name="calculate" value="Addition">Addition(+)</button>
  <button type="submit" name="calculate" value="Subtraction">Subtraction(-)</button>
  <button type="submit" name="calculate" value="Multiplication">Multiplication(x)</button>
  <button type="submit" name="calculate" value="Division">Division(/)</button>
</form>
<h3>${result}</h3>
</body>
</html>

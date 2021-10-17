<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/10/2021
  Time: 11:15 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Converter</title>
</head>
<body>
<%
    float rate = Float.parseFloat(request.getParameter("rate"));
    float usd = Float.parseFloat(request.getParameter("usd"));

    float vnd = rate * usd;
%>
<h1>Rate: <%=rate%></h1>
<h1>USD: <%=usd%></h1>
<h1>VND: <%=vnd%></h1>
<%--Giải thích mã lệnh trên:--%>

<%--request.getParameter("rate"): lấy về giá trị của tham số "rate" trong trường input text. Chuyển giá trị này sang số thực và gán vào biển rate--%>

<%--float rate = Float.parseFloat(request.getParameter("rate"));--%>
<%--request.getParameter("usd"): lấy về giá trị của tham số "usd" trong trường input text. Chuyển giá trị này sang số thực và gán vào biển usd--%>

<%--float usd = Float.parseFloat(request.getParameter("usd"));--%>
</body>
</html>

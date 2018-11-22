<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirm Page</title>
</head>
<body>
Confirm your transaction
<form action="recharge">
<input type="text" name="phoneNo" value="${msg.phoneNo}" readonly><br><br>
<input type="text" name="amount" value="${msg.amount}" readonly><br><br>
<input type="text" name="operator" value="${msg.operator}" readonly><br><br>
<input type="submit" value="Yes">
</form>
<form action="index.jsp">
<input type="submit" value="No">
</form>
</body>
</html>
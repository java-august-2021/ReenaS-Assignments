<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome </h1>
<p>Name: <c:out value="${firstName}"/></p>
<p>Email: <c:out value="${email}"/></p>
<p>Program: <c:out value="${program}"/></p>
<a href="/">Home</a>
<a href="/stack">Stack Details</a>
</body>
</html>
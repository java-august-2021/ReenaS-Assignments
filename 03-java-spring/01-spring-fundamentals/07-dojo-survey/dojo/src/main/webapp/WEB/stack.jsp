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
<h1> These are the stack details for you : 
<c:out value="${student.firstName}"/>
<c:out value="${student.lastName}"/>
<c:out value="${student.email}"/>

<h2>Student Projects:</h2>
<hr>
	<c:forEach items="${projects}" var="project">
	<p> <c:out value="${project.projectName}"/></p>   
	</c:forEach>
</h1>
</body>
</html>
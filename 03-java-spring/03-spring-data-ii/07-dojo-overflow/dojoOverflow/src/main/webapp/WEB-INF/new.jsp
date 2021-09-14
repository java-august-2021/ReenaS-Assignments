<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Question</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<form:form method="POST" action="/newQuestion" modelAttribute="question">
	<form:label path="qText">Question</form:label>
	<form:errors path="qText"/>
	<form:textarea path="qText"/>
	<hr>
	<form:label path="tags">Tags (separate by a comma)</form:label>
	<form:errors path="tags"/>
	<form:input path="tags"/>
	<button>Submit Question</button>
	</form:form>
</body>
</html>
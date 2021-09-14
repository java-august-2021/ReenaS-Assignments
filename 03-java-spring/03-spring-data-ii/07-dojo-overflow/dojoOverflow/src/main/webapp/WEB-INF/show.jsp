<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${question.qText}</h1>
	<p>
	<c:forEach items="${question.qTags}" var="tag">
		<${tag.subject},
	</c:forEach>
	</p>
	<hr>
	<h1>Answers:</h1>
	<ul>
	<c:forEach items="${question.answers}" var="answer">
	<li>${answer.aText}</li>
	</c:forEach>
	</ul>
	<hr>
	<h2>Add An Answer</h2>
	<form:form method="POST" action="/addAnswer" modelAttribute="answer">
	<p>
	<form:label path="aText">Answer</form:label>
	<form:errors path="aText"/>
	<form:input path="aText"/>
	<form:hidden path="quest" value="${question.id}"/>
	</p>
	</form:form>


</body>
</html>
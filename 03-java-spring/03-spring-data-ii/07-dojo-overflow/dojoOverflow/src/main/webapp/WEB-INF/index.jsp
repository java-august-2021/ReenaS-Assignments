<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<title>New Question</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<table>
			<tr>
				<th>Question</th>
				<th>Tags</th>
			</tr>
			<c:forEach items="${allQuestions}" var="q">
			<tr>
				<td><a href="/show/${q.id}">${q.qText}</a></td>
				<td>
				<c:forEach items="${q.qTags}" var="tagtext">
				<p>${tagtext.subject}</p>
				</c:forEach>
				</td>
				</tr>
				</c:forEach>
		</table>
		<h1><a href="/new">Click Here To Ask A Question</a></h1>
	</div>
</body>
</html>
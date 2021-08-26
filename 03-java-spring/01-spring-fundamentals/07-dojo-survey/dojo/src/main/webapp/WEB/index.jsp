<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<title>Insert title here</title>

</head>
<body>
<h1>Welcome to Coding Dojo!</h1>
<a href="/welcome">Dashboard</a>
 <form:form action="/create" method="post" modelAttribute="newStudent">
    <p>
        <form:label path="firstName">First Name</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
    <p>
        <form:label path="lastName">Last Name</form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
    </p>
    <p>
        <form:label path="email">email</form:label>
        <form:errors path="email"/>
        <form:input path="email"/>
    </p>
    
    <input type="submit" value="Submit"/>
</form:form>    

<form action="/welcome" method="POST">
<p> First Name: <input type="text" name="firstName"> </p>
<p> Last Name: <input type="text" name="lastName"> </p>
<p> email: <input type="text" name="email"> </p>
<p><button>Submit</button></p>
</form>

</body>
</html>
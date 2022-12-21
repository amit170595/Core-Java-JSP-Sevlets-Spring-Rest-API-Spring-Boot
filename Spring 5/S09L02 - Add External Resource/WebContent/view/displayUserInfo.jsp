<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserInfo</title>
</head>
<body>
Name: ${user.name}<br>
Gender: ${user.gender}<br>
Country: ${user.country}<br>
Introduction: ${user.introduction}<br>
Visited Countries:
<ul>
<c:forEach items="${user.visitedCountries}" var="item">
<li> ${item}</li>
</c:forEach>
</ul>
</body>
</html>
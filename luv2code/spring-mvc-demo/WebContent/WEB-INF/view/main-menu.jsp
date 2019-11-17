<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Home Page</title>

<!-- ${pageContext.request.contextPath} to access the correct root directory for your 
	 web application -->
<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/resources/css/my-test.css">

<script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>

<!-- Could have used include directive tags also, to attach css or js file. -->
</head>


<body>
<h2>Spring MVC Demo - Home Page</h2>
<hr>
<!-- This below anchor tag will hit a backend request with "hello/showForm" pattern. -->
<a href = "hello/showForm">Hello World form</a>

<br><br>

<!-- This below anchor tag will hit a backend request with "student/showForm" pattern. -->
<a href = "student/showForm">Student form</a>

<br><br>

<img src="${pageContext.request.contextPath}/resources/images/spring-boot-logo.png" />

<br><br>

<input type="button" onclick="doSomeWork()" value="Click Me"/>
</body>

</html>
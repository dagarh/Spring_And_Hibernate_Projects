<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Hello World - Input Form</title>
</head>

<!-- ${pageContext.request.contextPath}/processFormVersionThree
   	 ${pageContext.request.contextPath} gives root directory of the web application.
   	 So, if you want to remove previous parent controller level mapping in the URL then it 
   	 would be so useful. -->
<body>
	<form action="processFormVersionThree" method = "GET">
		<input type = "text" name = "studentName" 
			placeholder="What's your name" />
		<input type = "submit" />
	</form>
</body>

</html>
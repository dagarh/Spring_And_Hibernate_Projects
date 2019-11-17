<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

Hello World of Spring!

<br><br>

<!-- This is part of JSP expression language. For more detail, watch telusko video. param 
	 refers to Request params. -->
Student name: ${param.studentName}

<br><br>
<!-- JSP is reading this from the model object, which got populated by controller. -->
The message: ${message}

</body>

</html>
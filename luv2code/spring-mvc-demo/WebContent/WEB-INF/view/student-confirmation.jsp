<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Student Confirmation</title>
</head>

<body>

<!-- Here, it is making use of JSP expression language. Here, Model object will be passed by the
     Spring. So, we can fetch the model attributes directly, using JSP expression language.
     In order to get the information, below statement will call getters on the properties. -->
The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}
</body>
</html>
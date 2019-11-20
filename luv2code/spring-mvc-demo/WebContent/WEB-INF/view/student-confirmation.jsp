<!-- This is a page directive -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.luv2code.springdemo.mvc.Student"%>

    
<!-- This is a taglib directive. I added this so that we can make use of JSP standard tag library
	 (JSTL) features -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

<br><br>

<!-- Spring will call student.getFavoriteLanguage() -->
Favorite Language: ${student.favoriteLanguage}

<br><br>

<!-- This is a script-let tag. -->
<% 
	/* I am using script-let inside JSP, for looping over the array. Could have used JSTL. Since I 
	   am not a front-end developer, doing it with Java. Model attributes could also be accessed 
	   by using request attribute. */
	/* out, request, response, pageContext: these are all implicit objects provided by TOMCAT i.e
	   servlet container. Watch Telusko for more details. */
	out.print("Operating Systems: " + "<br><br>");
	Student student = (Student)request.getAttribute("student");
	/* Because inside model, we had "student" as an attribute. */
	for(String os: student.getOperatingSystems()) {
		out.print("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*&nbsp;&nbsp;" + os + "<br>");
	}
%>

<br><br>

<!-- I could achieve the above same thing by using JSTL tags in a easier way. -->
Operating Systems:
<ul>
	<!-- This student.operatingSystems will call student.getOperatingSystems(). And by using JSP
		 expression language, we can access attributes of a model, request, pageContext,...etc
		 directly. -->
	<c:forEach var="temp" items="${student.operatingSystems}">
		<li> ${temp} </li>
	</c:forEach>
</ul>


</body>
</html>
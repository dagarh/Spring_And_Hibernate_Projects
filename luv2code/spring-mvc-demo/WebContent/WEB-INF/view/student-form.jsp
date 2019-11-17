<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- Add taglib directive for using "Spring MVC Form Tags". One of the main features which we 
	 get by using Spring MVC form tags is: data binding. Data Binding automatically happens
	 through some POJO object(s) as a model attribute(s). -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>

<body>
	<!-- This modelAttribute must match with the attribute which you added to the Model object
		 inside Controller. When this form is loaded, Spring MVC will call getters on the 
		 corresponding fields which we specified in the path. And when we submit this form, 
		 Spring MVC will call setters on the corresponding fields. -->
	<form:form action = "processForm" modelAttribute = "student">
	 
	 <!-- path represents property of a model attribute's class -->
	 First name: <form:input path = "firstName"/>
	 
	 <br><br>
	 
	 <!-- path represents property of a model attribute's class -->
	 Last name: <form:input path = "lastName"/>
	 
	 <br><br>
	 
	 Country:
	 
	 <form:select path="country">
	 <!-- label is what user will see in the drop-down menu. value is what will be passed
	 	  to the "country" field of POJO. So, on submit, spring will call student.setCountry(..) -->
	 	  
	 <!-- Instead of hard-coding values, we can also configure these in a POJO class, inside 
	 	  constructor. And fetch values from either database or web-service or properties file. -->
	 	<form:option value = "Brazil" label = "Brazil" />
	 	<form:option value = "France" label = "France" />
	 	<form:option value = "Germany" label = "Germany" />
	 	<form:option value = "India" label = "India" />
	 	
	 </form:select>
	 
	 <br><br>
	 
	 <input type = "submit" value = "Submit">
	 
	</form:form>

</body>
</html>
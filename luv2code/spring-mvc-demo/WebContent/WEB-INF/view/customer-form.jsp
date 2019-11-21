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
	<title>Customer Registration Form</title>
	
	<style type="text/css">	
		 .error {
		 	color: red
		 }
	</style>
</head>

<body>

<i>Fill out the form. Asterisk (*) means required.</i>

<br><br> 

	<!-- Below are the Spring MVC form tags which we are using for data binding i.e for passing 
		 the data between views and controllers back and forth. With the help of Spring MVC form tags, 
		 data binding becomes very-very easy by using some POJO class object as a model attribute. -->
	
	<!-- This modelAttribute must match with the attribute which you added to the Model object
		 inside Controller. When this form is loaded, Spring MVC will call getters on the 
		 corresponding fields which we specified in the path. And when we submit this form, 
		 Spring MVC will call setters on the corresponding fields. -->
	<form:form action="processForm" modelAttribute="customer">
		
		<!-- path represents property of a model attribute's class -->
		First name: <form:input path = "firstName"/>
		 
		<br><br>
		 
		<!-- path represents property of a model attribute's class -->
		Last name (*): <form:input path = "lastName"/>
		<!-- display error message, just next to text field, if error message has been set. This
			 cssClass 'error' is defined above in the HTML header. -->
		<form:errors path = "lastName" cssClass="error"/>
		
		<br><br>
		
		<!-- path represents property of a model attribute's class -->
		Free passes (*): <form:input path="freePasses"/>
		<!-- display error message, just next to the text field, if error message has been set. 
			 This cssClass 'error' is defined above in the HTML header. -->
		<form:errors path = "freePasses" cssClass="error"/>
		
		<br><br>
		
		<!-- path represents property of a model attribute's class -->
		Postal Code: <form:input path="postalCode"/>
		<!-- display error message, just next to the text field, if error message has been set. 
			 This cssClass 'error' is defined above in the HTML header. -->
		<form:errors path = "postalCode" cssClass="error"/>
		
		<br><br>
		
		<input type = "submit" value = "Submit">
		
	</form:form>

</body>
</html>
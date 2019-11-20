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
	<!-- Below are the Spring MVC form tags which we are using for data binding i.e for passing 
		 the data between views and controllers back and forth. With the help of Spring MVC form tags, 
		 data binding becomes very-very easy by using some POJO class object as a model attribute. -->
	
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
	 <%-- <form:option value = "Brazil" label = "Brazil" />
	 	<form:option value = "France" label = "France" />
	 	<form:option value = "Germany" label = "Germany" />
	 	<form:option value = "India" label = "India" /> --%>
	 	
	 	<!-- items refer to the collection of data. Spring will call 
	 		 student.getCountryOptions() -->
	 	<%-- <form:options items="${student.countryOptions}"/> --%>
	 	
	 	<!-- Now we have added "theCountryOptions" field in the model itself. So can fetch this
	 		 model attribute by using JSP expression language. No need of student model attribute
	 		 now. -->
	 	<form:options items="${theCountryOptions}"/>
	 	
	 </form:select>
	 
	 <br><br>
	 
	 Favorite Programming Language:<br>
	 <!-- "path" specifies the student POJO property, to which "value" will be binded. On form
	 	  submission, spring will call student.setFavoriteLanguage(value). On form loading, it
	 	  will call student.getFavoriteLanguage().   -->
	 
	 <%-- Instead of hard coding these here, we can provide values from Student POJO class.  
	 <form:radiobutton path="favoriteLanguage" value="Java"/> Java&nbsp;&nbsp;  
	 <form:radiobutton path="favoriteLanguage" value="C#"/> C#&nbsp;&nbsp;
	 <form:radiobutton path="favoriteLanguage" value="PHP"/> PHP&nbsp;&nbsp;
	 <form:radiobutton path="favoriteLanguage" value="Ruby"/> Ruby&nbsp;&nbsp; --%> 
	 
	 <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
	 
	 <br><br>
	 
	 Operating Systems:
	 
	 <!-- Since it is a checkbox, so user can select multiple fields also. So the property 
	 	  (operatingSystems) to which we are binding the result, should be an Array/Collection. 
	 	  On submitting the form, spring will call student.setOperatingSystems(...) -->
	 <%-- Instead of hard coding values here, we could have provided values through Java file and 
	 	  could have used <form:checkboxes items="" path=""/> tag. OR
	 	  We could have brought values from properties file like we did in countryOptions case.  --%>
	 Linux <form:checkbox path="operatingSystems" value="Linux"/>
	 Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
	 MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
	 
	 <br><br>
	 
	 <input type = "submit" value = "Submit">
	 
	</form:form>

</body>
</html>
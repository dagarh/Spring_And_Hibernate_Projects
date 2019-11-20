<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- This is a taglib directive. I added this so that we can make use of JSP standard tag library
	 (JSTL) features -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Customer Confirmation</title>
</head>

<body>

<!-- Here, it is making use of JSP expression language. Here, Model object will be passed by the
     Spring. So, we can fetch the model attributes directly, using JSP expression language.
     In order to get the information, below statement will call getters on the properties. -->
The customer is confirmed: ${customer.firstName} ${customer.lastName}

<br><br>

Free passes: ${customer.freePasses}

</body>

</html>
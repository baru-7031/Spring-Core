<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

	<title>Register Form</title>
	<style>
		.error{
			color: red;
		}
	
	</style>
</head>
<body>
	
	<h1>Welcome to Register Form</h1>
	
	<form:form action="registerProcessForm" modelAttribute="user">
		UserName (<span Class="error">*</span>) : <form:input path="userName"/> <form:errors path="userName" cssClass="error" /> 
		<br><br>
		PassWord (<span Class="error">*</span>) : <form:input path="passWord"/> <form:errors path="passWord" cssClass="error" /> 
		<br><br>
		
		<input type="submit" value="Submit" />
		
	</form:form>
	
</body>
</html>
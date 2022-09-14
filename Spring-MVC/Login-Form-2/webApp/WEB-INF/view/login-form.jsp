<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
	<style>
		.error{
			color: red;
		}
	</style>
</head>


<body>

	<form:form action="loginProcessForm" modelAttribute="user">
	
		User Name (*) : <form:input path="userName"/> 
		<form:errors path="userName" cssClass="error" />	<br><br>
		Pass Word (*) : <form:input path="passWord"/> 
		<form:errors path="passWord" cssClass="error" />	<br><br>
		
		<input type="submit" value="Submit"/>
	
	
	</form:form>
	
</body>
</html>
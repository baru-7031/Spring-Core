<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

	<title>Login Form</title>
	<style>
		.error{
			color: red;
		}
	</style>

</head>

<body>

	<form:form action="processForm" modelAttribute="user">
	
		UserName (*) :  <form:input path="username" /> 
			<br><br>
		PassWord (*) : <form:input path="password" />
			<br><br>
		
		<input type="submit" value="Submit" />
		
	</form:form>


</body>

</html>


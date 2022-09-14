<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<title>Customer Confirmation Page</title>

</head>

<body>

The Customer Form Value is : ${customer.firstName} ${customer.lastName} 

<br><br>

Free Passes : ${customer.freePasses}

<br><br>

Postal Code : ${customer.postalCode}

<br><br>

Course Code : ${customer.courseCode}

</body>


</html>
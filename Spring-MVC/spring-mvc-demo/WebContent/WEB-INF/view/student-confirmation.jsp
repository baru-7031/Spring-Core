<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>

	<title>Student Confirmation</title>

</head>
<body>

The Student is Confirmed : ${student.firstName} ${student.lastName}

<br><br>

${student.firstName}'s Country name is : ${student.country}
<br><br>
The Student Favorite Language : ${student.favoriteLanguage}
<br><br>
Operating System :
<ul>
	<c:forEach var="temp" items="${student.operatingSystem}">
		<li> ${temp} </li>
	</c:forEach>
</ul>

</body>
</html>
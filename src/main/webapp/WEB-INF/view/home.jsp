<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
</head>
<body>
	<h1>
		<em> Sri It's time to look and feel things!!</em>
	</h1>

	<form:form action="${pageContext.request.contextPath }/logout "
		method="POST">

		<input type="submit" value="Logout">

	</form:form>

</body>
</html>
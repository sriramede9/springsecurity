<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="ISO-8859-1">
<title>Login-Form</title>
<style type="text/css">
body {
	background: orange;
}

.error {
	color: White;
}

.logout {
	color: blue;
}
</style>

</head>
<body>

	<h1>
		<em>Welcome to the Future </em>
	</h1>

	<h4>Please login to authenticate</h4>

	<form:form
		action="${pageContext.request.contextPath}/authenticateTheUser"
		method="POST">

		<div class="error">
			<c:if test="${param.error != null}">

				<em>Invalid credentials!!</em>
			</c:if>
		</div>
		<div class="logout">
			<c:if test="${param.logout != null}">

				<em>You are logged out succesfully</em>
			</c:if>

		</div>

		<br>


		<label for="username"> Username: <input type="text"
			name="username">

		</label>
		<br>
		<br>

		<label for="password"> Password: <input type="password"
			name="password">

		</label>

		<br>
		<br>

		<input type="submit" value="Login">



	</form:form>

</body>
</html>
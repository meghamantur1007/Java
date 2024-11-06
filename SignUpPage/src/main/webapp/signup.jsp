<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up Page</title>
</head>
<body>

<form action="signUp" method="post">
<pre>
UserId<input type="text" name="id" value=${dto.userId}>
Email<input type="text" name="email" value=${dto.email}>
Password<input type="text" name="password">
Confirm password<input type="text" name="confirmPassword">
<input type="submit" value="SignUp">
</pre>
</form>

<span style="color:green">${hi} ${userId} ${success}
<span style="color:red">${dto} ${failure}


</body>
</html>
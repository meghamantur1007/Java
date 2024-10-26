<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
</head>
<body>

<form action="register" method="post">
<pre>
Name<input type="text" name="name">
Email<input type="text" name="email">
Age<input type="text" name="age">
City<input type="text" name="city">
State<input type="text" name="state">
Country<input type="text" name="country">
<input type="submit" value="submit">
</pre>
</form>
<span style="color:green">${success}
<span style="color:red">${failure}
${dto}
</body>
</html>
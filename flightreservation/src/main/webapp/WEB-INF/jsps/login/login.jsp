<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
</head>
<body>
<form action="login" method="post">
	<pre>
	<h2>User Login:</h2>
	User Name:<input type="text" name="email" />
	Password:<input type="password" name="password" />
	<input type="submit" value="login" />
	${msg}
	</pre>
	</form>
</body>
</html>
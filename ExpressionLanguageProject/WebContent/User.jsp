<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Expression Language</title>
</head>
<body>
Hello ${sessionScope.user.name}
<br>
Your email: ${sessionScope.user.email}
<br>
<br>
Your city: ${sessionScope.user.addObj.city}
<br>

<br>
<a href="LinkJSPPage.jsp">Click me!!</a>
</body>
</html>
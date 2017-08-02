<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hello World!!!</h2>
<h3>Hi user ${user_name}</h3>

<c:forEach items="${users}" var="user">
${user.toString()}
</c:forEach>
</body>
</html>
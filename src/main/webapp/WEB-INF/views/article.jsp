<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Welcome</title>
</head>
<body>
	<h1>Article ${article.id}</h1>
	<p>
	${article}
	</p>
	
	<a href="<c:url value="/articles" />">Back</a>
</body>
</html>

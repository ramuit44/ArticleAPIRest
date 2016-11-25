<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Welcome</title>
</head>
<body>
	<h1>Articles</h1>
	<ul>
		<c:forEach items="${articles}" var="article">
			<li>
				<c:out value="${article}" /> <a href="<c:url value="/articles/${article.id}" />">Show</a>
				<form action="<c:url value="/articles/${article.id}" />" method="post">
					<input type="hidden" name="_method" value="delete" />
					<input type="submit" value="Delete" />
				</form>
			</li>
		</c:forEach>
	</ul>
</body>
</html>

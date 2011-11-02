<!DOCTYPE html>
<head>
<title>Book List</title>
<meta name="layout" content="main" />
</head>
<body>

<h2>Books</h2>

<g:each in="${books}" var="book">
	<p><g:link action="show" id="${book.id}" class="book_link">${book.title}</g:link></p>
</g:each>

</body>
</html>
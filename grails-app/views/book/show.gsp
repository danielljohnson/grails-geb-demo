<!DOCTYPE html>
<head>
<title>Book Details</title>
<meta name="layout" content="main" />
</head>
<body>

<h2>Book Title: ${book.title}</h2>

<h4>Author: ${book.author}</h4>

<p><g:link controller="book" action="list" elementId="back_link">Back</g:link></p>

</body>
</html>
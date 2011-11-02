<!DOCTYPE html>
<head>
<title>Book Details</title>
<meta name="layout" content="main" />
</head>
<body>

<h2>Title: ${book.title}</h2>

<h4>Author: ${book.author}</h4>

<h4>Category: ${book.category.title}</h4>

<br />

<p><g:link controller="book" action="list" elementId="back_link" class="btn">Back</g:link></p>

</body>
</html>
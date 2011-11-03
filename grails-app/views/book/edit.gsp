<!DOCTYPE html>
<head>
<title>Edit Book</title>
<meta name="layout" content="main" />
</head>
<body>

<h1>Edit: ${book.title}</h1>

<g:form action="update" id="${book.id}" class="form-stacked" method="PUT">
	<div class="clearfix">
		<label>Title: </label>
		
		<div class="input">
			<input type="text" name="title" value="${book.title}">
		</div>
	</div>
	<div class="clearfix">
		<label>Author: </label>
		
		<div class="input">
			<input type="text" name="author" value="${book.author}">
		</div>
	</div>
	<div class="clearfix">
		<label>Category: </label>
		
		<div class="input">
			<g:select name="category" from="${categories}" value="${book.category.id}" optionKey="id" optionValue="title" size="1" />
		</div>
	</div>
	
	<div class="clearfix" style="margin: 18px 0 0">
		<button class="btn primary" type="submit">Save changes</button></p>
	</div>
</g:form>

<p><g:link controller="book" action="list" elementId="back_link" class="btn">Back</g:link></p>

</body>
</html>
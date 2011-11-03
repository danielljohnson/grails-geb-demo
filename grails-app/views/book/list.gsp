<!DOCTYPE html>
<head>
<title>Book List</title>
<meta name="layout" content="main" />
</head>
<body>

<h1>Books</h1>

<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>

<table class="zebra-striped">
	<thead>
		<tr>
			<th>Title</th>
			<th>Author</th>
			<th>Category</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<g:each in="${books}" var="book">
			<tr>
				<td>${book.title}</td>
				<td>${book.author}</td>
				<td>${book.category.title}</td>
				<td><g:link action="show" id="${book.id}" class="btn view">View</g:link> <g:link action="edit" id="${book.id}" class="btn edit">Edit</g:link></td>
			</tr>
		</g:each>
	</tbody>
</table>

<p><a class="btn" href="${createLinkTo(dir:'')}">Back</a></p>

</body>
</html>
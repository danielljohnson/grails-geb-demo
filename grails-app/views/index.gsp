<html>
<head>
<title>Home Page</title>
<meta name="layout" content="main" />
</head>
<body>

<h1>Home Page</h1>

<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>

<p><g:link controller="book" action="list" elementId="books_link" class="btn primary" >View Book List</g:link></p>

<br />

<h3>Search for a book by title</h3>

<form method="post" action="" class="form-stacked" id="search_form">
    <div class="clearfix">
        <div class="input">
            <input type="text" name="title" id="title" />
        </div>
    </div>
    
    <div class="clearfix" style="margin: 18px 0 0">
        <button class="btn primary" type="submit" id="search_submit">Submit</button></p>
    </div>
</form>

<div id="search_results">
    
</div>

</body>
</html>

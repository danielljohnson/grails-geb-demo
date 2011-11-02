package demo;

import geb.Page

using "geb"

scenario "View a single book", {

	when "we go the homepage", { 
		to HomePage
	}

	then "we are on the homepage", { 
		at HomePage
	}
	
	when "we click the book list link", {
		page.booksLink.click();
	}
	
	then "we are on the book list page", {
		at BookListPage
		
		assert page.bookLinks.size() == 2
	}
	
	when "we click a book detail link", {
		page.bookLink('The Shining').click();
	}
	
	then "we are on a book detail page", {
		at BookDetailPage
	}
	
	when "we click the back link", {
		page.backLink.click();
	}
	
	then "we are on the book list page again", {
		at BookListPage
		
		assert page.bookLinks.size() == 2
	}
}

class HomePage extends Page {
	static at = { title == "Home Page" }
	static content = {
		booksLink { $('#books_link') }
	}
}

class BookListPage extends Page {
	static at = { title == "Book List" }
	static content = {
		bookLink(wait: true, to: BookDetailPage) { title ->
			$(".book_link", text: title)
		}
		
		bookLinks { $('.book_link') }
	}
}

class BookDetailPage extends Page {
	static at = { title == "Book Details"}
	static content = {
		backLink { $('#back_link') }
	}
}
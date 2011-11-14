package demo.pages

import geb.Page

class BookDetailPage extends Page {
	static at = { title == "Book Details"}
	
	static content = {
		titleHeader { $('h2', 0) }
		authorHeader { $('h4', 0) }
		categoryHeader { $('h4', 1) }
	}
}
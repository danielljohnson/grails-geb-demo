package demo.pages

import geb.Page

class HomePage extends Page {
	static at = { title == "Home Page" }
	static content = {
		bookListLink { $('#books_link') }
	}
}
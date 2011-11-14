package demo.pages

import geb.Page

class HomePage extends Page {
	static at = { title == "Home Page" }
	static content = {
		bookListLink(to: BookListPage) { $('#books_link') }
		titleField { $('input[name="title"]') }
		searchSubmitButton { $('#search_submit') }
		theResultsList(required: false) { $('#search_results ul') }
		theFirstResult(required: false) { $('#search_results a', 0) }
	}
}
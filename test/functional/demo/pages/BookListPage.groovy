package demo.pages

import geb.Page

class BookListPage extends Page {
	static at = { title == "Book List" }
	static content = {
		bookDetailLink(wait: true, to: BookDetailPage) {
			$(".view", 0)
		}
		
		bookEditLink(wait: true, to: BookEditPage) {
			$(".edit", 0)
		}
	}
}
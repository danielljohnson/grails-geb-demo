import geb.Page

class BookListPage extends Page {
	static at = { title == "Book List" }
	static content = {
		bookLink(wait: true, to: BookDetailPage) { title ->
			$(".book_link", text: title)
		}
		
		bookLinks { $('.book_link') }
	}
}
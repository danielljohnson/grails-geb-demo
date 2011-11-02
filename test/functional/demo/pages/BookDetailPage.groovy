import geb.Page

class BookDetailPage extends Page {
	static at = { title == "Book Details"}
	static content = {
		backLink { $('#back_link') }
	}
}
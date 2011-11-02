import geb.Page

class HomePage extends Page {
	static at = { title == "Home Page" }
	static content = {
		booksLink { $('#books_link') }
	}
}
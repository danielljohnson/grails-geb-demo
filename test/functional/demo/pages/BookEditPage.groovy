package demo.pages

import geb.Page

class BookEditPage extends Page {
	static at = { title == "Edit Book"}
	static content = {
		backLink { $('#back_link') }
	}
}
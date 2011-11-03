package demo;

import demo.pages.*

using "geb"

scenario "Edit a book", {
	when "we go the book list page", {
		to BookListPage
	}
	
	then "we are on the book list page", {
		at BookListPage
	}
	
	when "we click a book detail link", {
		page.bookLink().click()
	}
	
	then "we are on a book detail page", {
		at BookDetailPage
	}
	
	when "we click an book edit link", {
		page.bookEditLink().click()
	}
	
	then "we are on a book edit page", {
		at BookEditlPage
	}
}
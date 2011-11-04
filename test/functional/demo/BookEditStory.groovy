package demo;

import demo.pages.*

using "geb"

scenario "Edit a book", {
	
	when "we go the homepage", {
		to HomePage
	}

	then "we are on the homepage", { 
		at HomePage
	}
	
	when "we click the book list link", {
		page.bookListLink.click()
	}
	
	then "we are on the book list page", {
		at BookListPage
	}
	
	when "we click an book edit link", {
		page.bookEditLink().click()
	}
	
	then "we are on a book edit page", {
		at BookEditPage
	}
	
	when "we enter a new title", {
		page.nameField.value("A new title")
	}
	
	and "we enter a new author", {
		page.authorField.value("A new author")
	}
	
	and "we change the category", {
		assert page.categoryField.size() == 1
		
		assert page.categoryField.value() == "1"
		
		page.categoryField.value("2")
		
		assert page.categoryField.value() == "2"
	}
	
	and "we click the save button", {
		page.saveButton.click()
	}
	
	then "we are at the book detail page", {
		at BookDetailPage
		
		assert page.titleHeader.text() == "Title: A new title"
		assert page.authorHeader.text() == "Author: A new author"
		assert page.categoryHeader.text() == "Category: Fiction"
	}
}
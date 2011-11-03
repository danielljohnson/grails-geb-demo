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
		page.nameField << "A new title"
	}
	
	and "we enter a new author", {
		page.authorField << "A new author"
	}
	
	and "we change the category", {
		assert page.$('select[name="category"]').size() == 1
		
		assert page.categoryField.size() == 1
		
		assert page.categoryField.size() != 2
		
		assert page.$('form').category.size() == 1
		
		//page.$('form').category = "1"
		
		//page.$('form').category.value(1)
		
		//page.categoryField.value("1")
		
		page.categoryField = "1"
		
		//page.categoryField = 1
	}
	
	and "we click the save button", {
		page.saveButton.click()
	}
}
package demo;

import demo.pages.*

using "geb"

scenario "Search for a book", {

	when "we go the homepage", { 
		to HomePage
	}

	then "we are on the homepage", { 
		at HomePage
	}
	
	when "we enter a title into the search form", {
		page.titleField.value("The Shining")
	}
	
	and "we click the submit button", {
		page.searchSubmitButton.click()
		
		waitFor { page.theResultsList.size() > 0 }
	}
	
	then "we should have one or more results", {
		assert page.theFirstResult.text() == "The Shining by Stephen King"
	}
}
import demo.Category
import demo.Book

class BootStrap {

    def init = { servletContext ->
		Category category1 = new Category(title: "Horror").save(failOnError: true)
		Category category2 = new Category(title: "Fiction").save(failOnError: true)
	
		Book book1 = new Book(author: "Stephen King", title: "The Shining", category: category1).save(failOnError: true)
		Book book2 = new Book(author: "James Patterson", title: "Along Came a Spider", category: category1).save(failOnError: true)
    }

    def destroy = {
    }
}

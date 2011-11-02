package demo

class BookController {
	static layout = 'main'

    def list = {
		List<Book> books = Book.list()
		
		render(view: 'list', model: [ books: books ])
	}
	
	def show = {
		Book book = Book.get(params.id)
		
		render(view: 'show', model: [ book: book ])
	}
	
	def edit = {
		Book book = Book.get(params.id)
		List<Category> categories = Category.list()
		
		render(view: 'edit', model: [ book: book, categories: categories  ])
	}
	
	def update = {
		Book book = Book.get(params.id)
		List<Category> categories = Category.list()
		
		book.title = params.title
		book.author = params.author
		book.category = Category.get(params.category)
		
		if (book.save()) {
			redirect(action:"show", id: book.id)
		}
	}
}

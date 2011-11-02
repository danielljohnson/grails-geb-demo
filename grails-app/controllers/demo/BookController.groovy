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
}

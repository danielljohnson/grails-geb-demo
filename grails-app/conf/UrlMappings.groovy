class UrlMappings {

	static mappings = {
		
		"/book/list" {
	      controller = "book"
	      action = [GET: "list"]
	    }
	
		"/book/edit/$id" {
	      controller = "book"
	      action = [GET: "edit"]
	    }
	
		"/book/search" {
	      controller = "book"
	      action = [POST: "search"]
	    }
		
		"/book/$id?"(resource: "book")

		"/"(view:"/index")
		"500"(view:'/error')
	}
}

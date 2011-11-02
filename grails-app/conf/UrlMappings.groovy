class UrlMappings {

	static mappings = {
		
		"/book/list" {
	      controller = "book"
	      action = [GET: "list"]
	    }
		
		"/book/$id?"(resource: "book")

		"/"(view:"/index")
		"500"(view:'/error')
	}
}

package demo

import demo.Book

class Category {
	
	static hasMany = [ books : Book ]
	
	String title

    static constraints = {
		title(blank: false)
    }
}

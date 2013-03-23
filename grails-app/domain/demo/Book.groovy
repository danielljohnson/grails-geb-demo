package demo

import demo.Category

class Book {
  
  static belongsTo = [ category: Category ]
  
  String title
  String author

  static constraints = {
    title(blank: false)
    author(blank: false)
  }
}

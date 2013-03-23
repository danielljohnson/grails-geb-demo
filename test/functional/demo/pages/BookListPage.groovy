package demo.pages

import geb.Page

class BookListPage extends Page {
  static at = { title == "Book List" }
  static content = {
    bookDetailLink(to: BookDetailPage) { $(".view", 0) }
    bookEditLink(to: BookEditPage) { $(".edit", 0) }
    backButton(to: HomePage) { $("#back") }
  }
}
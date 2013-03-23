package demo;

import demo.pages.*

using "geb"

scenario "View a book detail page", {

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
  
  when "we click a book detail link", {
    page.bookDetailLink.click()
  }
  
  then "we are on a book detail page", {
    at BookDetailPage
  }
}
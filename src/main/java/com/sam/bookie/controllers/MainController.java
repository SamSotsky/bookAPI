package com.sam.bookie.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sam.bookie.models.Book;
import com.sam.bookie.services.BookService;

@Controller
public class MainController {

	
//	DEPEBDENCY INJECTION to use the services
	private final BookService bookService;
	public MainController(BookService bookService){
		this.bookService = bookService;
 }
	
	@RequestMapping("/")
	public String redirectMe() {
		return "redirect;/books";
	}
	
	@RequestMapping("/books")
	public String index(Model model) {
		List<Book> allBooks = bookService.allBooks();
		
		model.addAttribute("allBooksMUNKIE", allBooks);
		
		return "/books/index.jsp";
	}
	
	@GetMapping("/books/{id}")
	public String index(Model model, @PathVariable("id") Long id) {
		
		Book book = bookService.findBook(id);
		
		model.addAttribute("book", book);
		return "oneBook.jsp";
 }
}

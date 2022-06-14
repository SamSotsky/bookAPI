package com.sam.bookie.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sam.bookie.models.Book;
import com.sam.bookie.repos.BookRepo;

@Service
public class BookService {
	 // adding the book repository as a dependency
    private final BookRepo bookRepo;
    
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    
    
    
    
    
    
    // returns all the books
    public List<Book> allBooks() {
        return bookRepo.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepo.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
 // UPDATE a book
    public Book updateBook(Book b) {
        return bookRepo.save(b);
    }
    
//    Deletes a book
    public void deleteBook(Long id) {
    	bookRepo.deleteById(id);
    }
}

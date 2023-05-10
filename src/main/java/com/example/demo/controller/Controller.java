package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.*;
import com.example.demo.service.BookService;

@RestController
public class Controller {
	
	@Autowired
	private BookService bookservice;
	
	@GetMapping(value="/books",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getBooks() {
	
		System.out.println(this.bookservice.getAllBooks());
		return this.bookservice.getAllBooks();
	}
	
	@GetMapping(value="/books/{bookcode}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Book getBook(@PathVariable("bookcode") int bookcode) {
		System.out.println(bookservice.getBookById(bookcode));
		return bookservice.getBookById(bookcode);
	}
	
	@PostMapping(value="/books",consumes=MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Book addBook( @RequestBody Book book) {
		
		Book b=this.bookservice.addBook(book);
		System.out.println(bookservice.addBook(book));
		System.out.println(book);
		return b;
		
	}
	
	@DeleteMapping("/books/{bookcode}")
	public void deleteBook(@PathVariable("bookcode") int bookcode) {
		this.bookservice.deleteBook(bookcode);
		
	}
	
	@PutMapping("/books/{bookcode}")
	public Book updateBook(@RequestBody Book book,@PathVariable("bookcode") int bookcode) {
		this.bookservice.updateBook(book,bookcode);
		return book;
	}

}

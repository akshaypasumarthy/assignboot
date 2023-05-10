package com.example.demo.service;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.entities.*;

@Component
public class BookService {
	
	private static List<Book> list = new ArrayList<>();
	
	static {
		
			list.add(new Book(123,"java","a","03-05-2023"));
			list.add(new Book(1231234,"java1","a1","03-05-2023"));	
	}
	
	public List<Book> getAllBooks(){
		return list;
	}
	
	public Book getBookById(int bookcode) {
		Book book=null;
		book= list.stream().filter(e->e.getBookcode()==bookcode).findFirst().get();
		return book;
	}
	
	public Book addBook(Book b)
	{
		list.add(b);
		return b;
		
	}

	public void deleteBook(int bookcode) {
		// TODO Auto-generated method stub
		
		list=list.stream().filter(book->book.getBookcode()!=bookcode).collect(Collectors.toList());
		
	}

	public void updateBook(Book book, int bookcode) {
		// TODO Auto-generated method stub
		list = list.stream().map(b->{
			if(b.getBookcode()==bookcode) {
				b.setAuthor(book.getAuthor());
				b.setBookname(book.getBookname());
			}
			return b;
		}).collect(Collectors.toList());
		
	}
	

}

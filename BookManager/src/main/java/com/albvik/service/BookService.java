package com.albvik.service;

import java.util.List;

import com.albvik.model.Book;

public interface BookService {
	public void addBook(Book book);
	public void updateBook(Book book);
	public void removeBook(int id);
	public Book getBookById(int id);
	public List<Book> listBooks();
}

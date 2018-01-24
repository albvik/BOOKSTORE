package com.albvik.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.albvik.dao.BookDao;
import com.albvik.model.Book;

@Service
public class BookServiceImpl implements BookService {
	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	@Transactional
	public void addBook(Book book) {
	this.bookDao.addBook(book);
	}

	@Override
	@Transactional

	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		this.bookDao.updateBook(book);
	}

	@Override	
	@Transactional

	public void removeBook(int id) {
		// TODO Auto-generated method stub
		this.bookDao.removeBook(id);
	}

	@Override	
	@Transactional

	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return this.bookDao.getBookById(id);
	}

	@Override
	@Transactional

	public List<Book> listBooks() {
		// TODO Auto-generated method stub
		return this.bookDao.listBooks();
	}
	
}

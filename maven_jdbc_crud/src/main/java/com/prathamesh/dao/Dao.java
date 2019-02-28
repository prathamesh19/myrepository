package com.prathamesh.dao;

import java.util.List;

import com.prathamesh.bean.Book;

public interface Dao {
	boolean addBook(Book b);
	boolean deleteBook(Book b);
	boolean updateBook(Book b);
	Book getBook(Book b);
	List<Book> getAllBooks();
}

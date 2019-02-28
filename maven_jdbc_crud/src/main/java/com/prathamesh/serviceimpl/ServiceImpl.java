package com.prathamesh.serviceimpl;

import java.util.List;

import com.prathamesh.bean.Book;
import com.prathamesh.dao.Dao;
import com.prathamesh.daoimpl.DaoImpl;
import com.prathamesh.service.Service;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ServiceImpl implements Service {
Dao dao=new DaoImpl();
	public boolean addBook(Book b) {
		return dao.addBook(b);
	}

	public boolean deleteBook(Book b) {
		// TODO Auto-generated method stub
		return dao.deleteBook(b);
	}

	public boolean updateBook(Book b) {
		// TODO Auto-generated method stub
		return false;
	}

	public Book getBook(Book b) {
		// TODO Auto-generated method stub
		return dao.getBook(b);
	}

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

}

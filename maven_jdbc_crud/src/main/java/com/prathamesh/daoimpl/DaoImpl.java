package com.prathamesh.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.prathamesh.bean.Book;
import com.prathamesh.dao.Dao;

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
public class DaoImpl implements Dao{
List<Book> l=new ArrayList();

	public boolean addBook(Book b) {
		// TODO Auto-generated method stub
		return l.add(b);
	}

	public boolean deleteBook(Book b) {
		// TODO Auto-generated method stub
		return l.remove(b);
	}

	public boolean updateBook(Book b) {
		// TODO Auto-generated method stub
		return false;
	}

	public Book getBook(Book b) {
		// TODO Auto-generated method stub
		return b;
	}

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return getAllBooks();
	}

}

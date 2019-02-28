package com.prathamesh.test.logic;

import java.sql.SQLException;

import com.prathamesh.bean.Book;
import com.prathamesh.service.Service;
import com.prathamesh.serviceimpl.ServiceImpl;
import com.prathamesh.utilities.Utilities;

public class TestClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Book b1=new Book(101,"java");
Book b2=new Book(102,"python");
Book b3=new Book(103,"cpp");
Service service=new ServiceImpl();
service.addBook(b1);
service.addBook(b2);
service.addBook(b3);
//System.out.println(service);
//service.deleteBook(b1);
//System.out.println(service);
//System.out.println(service.getBook(b3));
//System.out.println(service.getAllBooks());

Utilities.databaseConnection();



	}

}

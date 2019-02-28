package com.java.mavendemo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class TestMain {
public static void main(String[] args) {
	Book b1=new Book(101,"java");
	Book b2=new Book(102,"python");
	Book b3=new Book(103,"cpp");
	
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
}
}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
class Book{
	private int bookId;
	private String bookName;
}
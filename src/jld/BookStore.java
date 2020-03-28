package com.jld;

import java.util.ArrayList;
import java.util.List;

class Book {
	String title;
	String auther;
	int year;
	float price;
	String category;
}

class BookStore {
	public static void main(String args[]) {
		Book book1 = new Book();
		book1.price = 300;
		System.out.println();
	}

	List<Book> books = new ArrayList()	;
}


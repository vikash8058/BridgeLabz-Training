package com.libraryorganizer;

import java.util.Objects;

public class Book {

	// making title and author as instance variable
	private String title;
	private String author;

	// constructor to initialize instance variable
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// method to retrieve the title
	public String getTitle() {
		return title;
	}

	//overriding the methods to check the object with title wise not memory based
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Book))
			return false;

		Book book = (Book) o;
		return title.equalsIgnoreCase(book.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title.toLowerCase());
	}

	@Override
	public String toString() {
		return title + " by " + author;
	}
}

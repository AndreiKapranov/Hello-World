package grsu.example.hui.fivefour.java;

import grsu.example.hui.fivefour.java.Genre;

public class Book {
	
	private String author;
	private String title;
	private Genre genre;
	private int yearOfPublication;

	public Book() {
		this.author = "author";
		this.title = "title";
		this.genre = null;
		this.yearOfPublication = 0;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;

	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

public void setYearOfPublication(int yearOfPublication) {
	this.yearOfPublication = yearOfPublication;
}
}



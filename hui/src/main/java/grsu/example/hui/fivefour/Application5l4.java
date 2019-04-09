package grsu.example.hui.fivefour;

import grsu.example.hui.fivefour.java.Book;
import grsu.example.hui.fivefour.java.Genre;
	

public class Application5l4 {
	

	public static void main(String[] args) {

		Book boook = new Book();
	    boook.setAuthor("H.Hesse");
		boook.setTitle("Knulp");
		boook.setGenre(Genre.valueOf("CLASSICS"));
		boook.setYearOfPublication(1915);
		System.out.println("Book:" + "\n" + "Author: " + boook.getAuthor() + "\n" + "Title: " + boook.getTitle() + "\n"
				+ "Genre: " + boook.getGenre() + "\n" + "Year of publication: " + boook.getYearOfPublication());
	}

}
package week6;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> books = new ArrayList<Book>();

	public Library() {

	}

	public void addBook(Book newBook) {
		books.add(newBook);
	}

	public void printBooks() {
		for (Book book : this.books) {
			System.out.println(book);
		}
	}

	public ArrayList<Book> searchByTitle(String title) {
		ArrayList<Book> found = new ArrayList<Book>();

		for (Book book : this.books) {
			if(StringUtils.included(book.title(), title)) {
				found.add(book);
			}
		}

		return found;
	}
	
	public ArrayList<Book> searchByPublisher(String title) {
		ArrayList<Book> found = new ArrayList<Book>();

		for (Book book : this.books) {
			if(StringUtils.included(book.publisher(), title)) {
				found.add(book);
			}
		}

		return found;
	}
	
	public ArrayList<Book> searchByYear(int year) {
		ArrayList<Book> found = new ArrayList<Book>();

		for (Book book : this.books) {
			if (book.year() == year) {
				found.add(book);
			}
		}

		return found;
	}



}

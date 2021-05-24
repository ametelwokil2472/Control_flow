package com.qa.controlflow.javabeginner.OOP.librarySystem;

public abstract class Items implements MarketLevel {

	private String title;
	private String author;
	public int id;
	public static int count = 0;

	public Items(String title, String author) {

		this.title = title;
		this.author = author;
		this.id = ++count;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

//public boolean isCheckOut() {
//	
//}

	@Override
	public String toString() {
		return "Items [title=" + title + ", author=" + author + "]";
	}

}

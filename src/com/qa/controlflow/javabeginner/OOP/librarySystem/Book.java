package com.qa.controlflow.javabeginner.OOP.librarySystem;

public class Book extends Items {

	private int numberOfPages;

	public Book(String title, String author, int numberOfPages) {
		super(title, author);
		this.numberOfPages = numberOfPages;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "Book [Title = " + getTitle() + "\s" + "  Author " + getAuthor() + "\s" + " Number of pages "
				+ numberOfPages + "\s" + ", Id=" + id + "]";
	}

	@Override
	public void MarketLevel() {
		System.out.println("Higher Market Level");

	}

	@Override
	public void isReading() {
		// TODO Auto-generated method stub

	}

}

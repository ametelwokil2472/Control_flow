package com.qa.controlflow.javabeginner.OOP.librarySystem;

public class Gdocuments extends Items {
	private String type;

	public Gdocuments(String title, String author, String type) {
		super(title, author);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void MarketLevel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Gdocuments [type=" + type + ", id=" + id + ", getType()=" + getType() + ", getTitle()=" + getTitle()
				+ ", getAuthor()=" + getAuthor() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void isReading() {
		// TODO Auto-generated method stub
		
	}

	
	
 
}

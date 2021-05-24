package com.qa.controlflow.javabeginner.OOP.librarySystem;

public class Newspapers extends Items {
   
	private String type;

	public Newspapers(String title, String author, String type) {
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
	public String toString() {
		return "Newspapers [type=" + type + "]";
	}

	@Override
	public void MarketLevel() {
	System.out.println("Higher Market level");
		
	}

	@Override
	public void isReading() {
		// TODO Auto-generated method stub
		
	}
	
	
}

package com.qa.controlflow.javabeginner.constructors;

public class Book {
	
		 public String title; //
		 public int noOfPages; //
		 public String author; //
		 public boolean isOnline;
		 public String genre; 
		 
		 public Book(String title, int noOfPages, String genre) {
			 this.title = title;
			 this.noOfPages = noOfPages;
			 this.genre = genre;
			 } 
		 
		 public String read() {
			 return this.title + " has " +this.noOfPages + " its type is " + this.genre;
			 }
}

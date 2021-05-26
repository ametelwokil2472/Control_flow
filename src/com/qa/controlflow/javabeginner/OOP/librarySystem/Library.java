package com.qa.controlflow.javabeginner.OOP.librarySystem;

import java.util.List;

public class Library {
	public boolean isCheckOut;
	List<Items> LibraryList;
	List<Person> personList;

	public Library(List<Items> LibraryList,List<Person> personList) {
		this.LibraryList = LibraryList;
		this.personList=personList;
	}
	
//	public Library() {
//	super();
//
//	this.itemList = new ArrayList<>();
//	this.personList = new ArrayList<>();
//}


	public void addItems(Items item) {
	    isCheckOut = true;
		LibraryList.add(item);
	}

	public void removItems(Items item) {
		LibraryList.remove(item);
		 isCheckOut = false;
	}

	public void removByID(int id) {
		LibraryList.remove(id);
		 isCheckOut = false;
	}

	public void removAll() {
		LibraryList.clear();
	}
  public void registerMemberShip(Person person11) {
	  personList.add(person11);
  }
  public void removeMemberShip(Person person11) {
	  personList.remove(person11);
  }
  
@Override
public String toString() {
	return "Library [isCheckOut=" + isCheckOut + ", LibraryList=" + LibraryList + ", personList=" + personList + "]";
}



}

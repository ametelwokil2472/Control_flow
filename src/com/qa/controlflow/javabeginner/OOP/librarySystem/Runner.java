package com.qa.controlflow.javabeginner.OOP.librarySystem;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book fic = new Book("Ermias", "TG", 46);
		Newspapers Sci = new Newspapers("Ermias", "TG", "Celebrity");
		Gdocuments phan = new Gdocuments("Ermias", "TG", "Policy");
		Person person1 = new Person("Amete", true);

		List<Items> libList = new ArrayList<>();
		List<Person> personlist = new ArrayList<>();
		Library k = new Library(libList, personlist);

		k.addItems(fic);
		k.addItems(Sci);
		k.addItems(phan);
		k.addItems(phan);
		k.removItems(phan);
		k.registerMemberShip(person1);
		k.removeMemberShip(person1);
        //k.removAll();

		System.err.println(k);
		Sci.MarketLevel();
	}

}

package com.qa.controlflow.javabeginner.arralist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<String> animal = new ArrayList<String>();
		animal.add("cow");
		animal.add("cat");
		animal.add("dog");
		animal.add("ant");
		animal.add("frog");
		animal.add("elephant");
		animal.add("fish");
		animal.add("owl");
		animal.add("birds");
		System.out.println("First ArrayList is: " + animal);

		// iterate through the ArrayList and print out each element (with both normal
		// and enhanced for-loops)

		for (int i = 0; i < animal.size(); i++) {
			System.out.println(animal.get(i));
		}
		for (String myAnimal : animal) {
			System.out.println(myAnimal);
		}

		// get() specific elements
		
		System.out.println(animal.get(4));

		// set() different elements
		animal.set(3, "Dolphin");
		System.out.println(animal);

		// remove() elements
		animal.remove(0);
		System.out.println(animal);
		animal.size();

//sort() the ArrayList 
		Collections.sort(animal);

		for (String i : animal) {
			System.out.println(i);
		}
//try using the reverse(), swap() and clone() methods from the Collections class
//			Collections.reverse(animal);
//			System.out.println(animal);
			
			ArrayList<String> arrayListClone = new ArrayList<String>(); 
			arrayListClone = (ArrayList<String>) animal.clone();
			
	         
	        System.out.println("Second ArrayList is: " + arrayListClone);
		}
	}



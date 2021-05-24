package com.qa.controlflow.javabeginner.OOP.librarySystem;

public class Person implements MarketLevel {
	private String name;
	private boolean isRegistered;
	private int memberId;
	public static int count = 1;

	public Person(String name, boolean isRegistered) {
		super();
		this.name = name;
		this.isRegistered = isRegistered;
		this.memberId = ++count;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	@Override
	public void MarketLevel() {
		// TODO Auto-generated method stub

	}

	public void isReading() {
		System.out.println("This Person is reading Newspaper");

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", isRegistered=" + isRegistered + ", memberId=" + memberId + "]";
	}

}

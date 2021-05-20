package com.qa.controlflow.javabeginner.OOP.abstraction;

public class Car extends Vehicle {

	 private int doors;
	    
	    public Car(String color, String model, int doors) {
	        super(color, model);
	        this.doors = doors;
	}
 public int getDoors() {
	return doors;
}
 public void setDoors(int doors) {
	this.doors = doors;
}
	@Override
	public void drive() {

		System.out.println("Car is moving");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping");

	}

	@Override
	public void park() {
		System.out.println("Car is parking");

	}

}

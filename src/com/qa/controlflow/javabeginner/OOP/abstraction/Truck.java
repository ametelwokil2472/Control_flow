package com.qa.controlflow.javabeginner.OOP.abstraction;

public  class Truck extends Vehicle {
	
	   private int load;

	public Truck(String color, String model, int load) {
		super(color, model);
		this.load = load;
	}
	

	public int getLoad() {
		return load;
	}


	public void setLoad(int load) {
		this.load = load;
	}


	@Override
	public void drive() {
		System.out.println("Truck is moving");

	}

	@Override
	public void stop() {
		System.out.println("Truck is stopping");

	}

	@Override
	public void park() {
		System.out.println("Motor is in park mode");

	}

}

package com.qa.controlflow.javabeginner.OOP.abstraction;

public  class Motercycle extends Vehicle {
         private int wheel;
         
	public Motercycle(String color, String model, int wheel) {
		super(color, model);
		this.wheel = wheel;
		
	}

	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	@Override
	public void drive() {
		 System.out.println("Motor is in drive mode");

	}

	@Override
	public void stop() {
		 System.out.println("Motor is in stop mode");

	}

	@Override
	public void park() {
		 System.out.println("Motor is in park mode");

	}

}

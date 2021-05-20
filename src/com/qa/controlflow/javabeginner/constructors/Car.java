package com.qa.controlflow.javabeginner.constructors;

public class Car {

	// Attributes
	private int yearModel;
	private String brand;
	private int speed; // mile/hr

	// Constructor
	public Car(int yearModel, String brand, int speed) {
		this.yearModel = yearModel;
		this.brand = brand;
		this.speed = speed;

	}

	// Methods
	public int getYearModel() {
		return yearModel;
	}

	public String getMake() {
		return brand;
	}

//	    public String getSpeed() {
//	        return this.brand + " with " + this.yearModel +"  model has " + this.speed + " m/hr Speed";
//	    }
	public int getyearModel(int yearModel) {
		return this.yearModel;
	}

	public void setyearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public String getbrand(int brand) {
		return this.brand;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}

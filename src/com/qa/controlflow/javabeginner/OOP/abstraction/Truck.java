package com.qa.controlflow.javabeginner.OOP.abstraction;

public  class Truck extends Vehicle {
	
	   private int load;


	Truck(int id, String color, String model, int year, int load) {
		super(id, color, model, year);
		// TODO Auto-generated constructor stub
	}


	public int getLoad() {
		return load;
	}

	public void setLoad(int load) {
		this.load = load;
	}
	 @Override
	  public String toString() {
	    return (
	      "Model: " +
	      this.model +
	      "\n" +
	      "Year: " +
	      this.year +
	      "\n" +
	      "Manufacturer: " +
	      this.color +
	      "\n" +
	      "Can it fly?: " +
	      this.load +
	      "\n"
	    );
	  }
	}

	



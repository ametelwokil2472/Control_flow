package com.qa.controlflow.javabeginner.OOP.abstraction;

public abstract class Vehicle {
	 private String color;
	    private String model;
	    
	 Vehicle(String color, String model){
	        this.color = color;
	        this.model = model;
	    }
	 
	 
	 public String getColor() {
		return color;
	}
	 public void setColor(String color) {
		this.color = color;
	}
	 public String getModel() {
		return model;
	}
	 public void setModel(String model) {
		this.model = model;
	}
	    
	    abstract void drive();
	    abstract void stop();
	    abstract void park();
	    
	    public void horn(){
	        System.out.println("Peeeeeep");
	    }
	}
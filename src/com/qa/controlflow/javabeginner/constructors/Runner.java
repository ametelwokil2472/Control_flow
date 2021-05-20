package com.qa.controlflow.javabeginner.constructors;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Book mame = new Book("The secrec", 200, "ScFi");;
    		  		  
      System.out.println(mame.read());
    	
     Person Amet = new Person("TG", 38, "Female");
     System.out.println(Amet.gender);
     
     Car myCar = new Car(2021, "Toyota", 100);
     System.out.println(myCar.getSpeed());
     
    // String x = Amet.name + " with " + myCar.setbrand("Toyota")+ " "+ myCar.getYearModel() + " comming";
    // System.out.println(x);
     
     
	}

}

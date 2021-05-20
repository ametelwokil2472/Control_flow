package com.qa.controlflow.javabeginner.OOP;

import com.qa.controlflow.javabeginner.OOP.abstraction.*;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sportsCar = new Car("White","McLaren",2);
		   System.out.println(sportsCar.getColor());
		   System.out.println(sportsCar.getModel());
		   System.out.println(sportsCar.getDoors());
	       sportsCar.drive();
	       sportsCar.stop();
	       sportsCar.park();
	       sportsCar.horn();
	       
	       
	     Motercycle motor = new Motercycle ("Green","Riva", 40);
	     System.out.println(motor.getColor());
		   System.out.println(motor.getModel());
		   System.out.println(motor.getWheel());
	      motor.drive();
	      motor.park();
	      motor.stop();
	      motor.horn();
	       
       Truck amzn = new Truck("black", "amzn", 600);
            System.out.println(amzn.getLoad());
 		   System.out.println(amzn.getColor());
 		   System.out.println(motor.getWheel());
            amzn.drive();
            amzn.park();
            amzn.stop();
            amzn.horn();
	      
       Vehicle[]myGarage = new Vehicle[3];
        myGarage[0]= new Car("White","McLaren",2);
        myGarage[1]= new Motercycle ("Green","Riva", 40);
        myGarage[2]= new Truck("black", "amzn", 600);
     for(int i = 0; i< myGarage.length; i++) {
    	 
            
    	}
}
}
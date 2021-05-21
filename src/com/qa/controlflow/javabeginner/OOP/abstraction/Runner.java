package com.qa.controlflow.javabeginner.OOP.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Runner {
public static void main(String[] args) {
	
   Car Toyota = new Car (1,"Black", "S28", 1999, 4);
    Motercycle sport = new Motercycle (2, "whit", "H1992", 2021, "oldg");
    Truck isuzu = new Truck(3, "Gray", "amz30", 1992, 6000);
    List<Vehicle> downtown = new ArrayList<Vehicle>();
    Garage location = new Garage(downtown);
    
//=================adds vehicles=================================
    location.addVehcle(Toyota);
    location.addVehcle(sport);
    
 //================calculate bill================================
    double bill = location.calcBill();
    System.out.println("Cost is: "+ bill + "$");
//===============Vehicles  in the garage==============================
    location.printList();
//=====================remove by object====================================
    location.removeByID(2);
    location.printList();

    location.removeByID(2);
    location.printList();
    
    
//===============add the truck and then remove all.
    location.addVehcle(isuzu);
    location.printList();
    location.removeAll();
    location.printList();

//===============Remove=====================================
    location.addVehcle(isuzu);
    location.printList();
    location.removeByType("Truck");
    location.printList();


}
	
}


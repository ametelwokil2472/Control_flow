package com.qa.controlflow.javabeginner.OOP.inheritance;

public class Runner {

	public static void main(String[] args) {
		
//=====================Employee=========================================
		Employee tgg = new Employee("TG", 38 , "Female" ,66788.34);
 	    System.out.println(tgg.getName());
      System.out.println(tgg.calculateWeeklySalary());
      
//======================Trainee========================================
      Trainee newCommer = new Trainee("Hania", 21, "Richardson");
	
	
     	newCommer.addSubject("Java");
		newCommer.addSubject("C++");
    	newCommer.addSubject("JavaScript");
	
  	System.out.println(newCommer.getSubjectslearned());
	}

}

package com.qa.controlflow.javabeginner.OOP.inheritance;

public class Employee extends Person {

	private double annualSalary;
	private double weeklySalary;
		
	
public  Employee(String name, int age, String gender,double annualSalary) {
		super(name, age, gender);
		this.annualSalary = annualSalary;
		
		
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
     public double calculateWeeklySalary() {
	  return weeklySalary = annualSalary/52.0;
 }
}

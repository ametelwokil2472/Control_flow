package com.qa.controlflow.javabeginner.OOP.inheritance;

public class Employee extends Person {

	private double annualSalary;
	private double weeklySalary;
	
	
	public Employee( double annualSalary,double weeklySalary ) {
		this.annualSalary = annualSalary;
		this.weeklySalary = weeklySalary;
	}

	public Employee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
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
	
     public  double calculateWeeklySalary(double annualSalary) {
	 return this.weeklySalary = annualSalary/53;
 }
}

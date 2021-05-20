package com.qa.controlflow.javabeginner.OOP.inheritance;

public class Trainee extends Person {
	private double bursary;
	private String subjectsLearned;

	public Trainee(double bursary, String subjectsLearned) {
		this.bursary = bursary;
		this.subjectsLearned = subjectsLearned;
	}

	public Trainee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public double getBursary() {
		return bursary;
	}

	public void setBursary(double bursary) {
		this.bursary = bursary;
	}

	public String getSubjectsLearned() {
		return subjectsLearned;
	}

	public void setSubjectsLearned(String subjectsLearned) {
		this.subjectsLearned = subjectsLearned;
	}
	
//	public String addSubject(String subjectsLearned) {
//		List<Subject> subjects = new List<subjectsLearned>();
//}
}
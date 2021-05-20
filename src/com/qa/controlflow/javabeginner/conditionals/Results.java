package com.qa.controlflow.javabeginner.conditionals;

public class Results {
	public static double physics = 150;
	public static double chemistry = 150;
	public static double biology = 80;
	public static double total;
	public static double percentage;
	public static double passmarkPhy = physics * 100 / 150;
	public static double passmarkChem = chemistry * 100 / 150;
	public static double passmarkBio = biology * 100 / 150;

//Results Revisited

	public static void displayResult() {

		System.out.println("physics Mark" + physics);
		System.out.println("chemistry Mark" + chemistry);
		System.out.println("biology Mark" + biology);
		total = physics + chemistry + biology;
		percentage = total * 100 / 450;

		System.out.println("Over all marks" + total);
		System.out.println("Percentage  " + percentage);

//	if(percentage < 60) {
//		System.err.println("You have failed");
//	}else {
//		System.err.println("You hava passed");
	}

	public static void displayOverallPassMark() {

		if ((passmarkPhy > 60) && (passmarkChem > 60) && (passmarkBio > 60)) {
			System.out.println("You pass all exam");
		} else {
			System.out.println("You fail");
		}
	}

}

package com.qa.controlflow.javabeginner.operators;

public class Calculator {
	
	
public static int add (int x, int y) {
	return x + y;
}

public static int mult(int x, int y) {
	return x * y;
}

public static int sub(int x, int y) {
	return x - y;
}

public static void  div(double x, double y) {
	if (x > y) {
		System.out.println(x/y);
	}else {
	System.out.println("can not be divided");
	}
	}




}









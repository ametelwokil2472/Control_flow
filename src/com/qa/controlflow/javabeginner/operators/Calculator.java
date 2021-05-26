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

public static double  div(double x, double y) {
	
	
	try {

        double result=x/y; 
        System.out.println(result);
        System.out.println("inside-try");

    } catch (Exception e) {

        System.out.println("division by zero exception");
        System.out.println("inside-catch");

    }
	return x/y;
}
}









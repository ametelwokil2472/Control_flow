package com.qa.controlflow.javabeginner.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExample {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		boolean flag = true;

		int choice;

		do {
			System.out.println(" Your Calculator \n");
			System.out.print("1. Addition \n");
			System.out.print("2. Subtraction.\n");
			System.out.print("3. Multiplication.\n");
			System.out.print("4. Division.\n");
			System.out.print("5. Exit\n");
			System.out.print("Select Your choice ");

			choice = input.nextInt();

			switch (choice) {

			case 1:
				// Addition
				add();
				break;

			case 2:
				// Subtraction
				sub();
				break;

			case 3:
				// Product
				mult();
				break;

			case 4:
				// Division
				div();
				break;
			case 5:
				System.out.println("Exit");
				flag = false;
				break;
			default:
				System.out.println("Please Select Another");
				break;

			}
		} while (flag);

		input.close();
		System.out.println("Application End");
	}

	public static void add() {
		int num1, num2, sum;
		System.out.print("Enter The First Number: ");
		num1 = input.nextInt();
		System.out.print("\n Enter The Second Number: ");
		num2 = input.nextInt();
		sum = num1 + num2;
		System.out.print("The Sum Of The Numbers is: " + sum);
	}

	public static void sub() {
		int num3, num4, diff;
		System.out.println("\nPlease Enter The First Number: ");
		num3 = input.nextInt();
		System.out.println("Please Enter The Second Number: ");
		num4 = input.nextInt();
		diff = num3 - num4;
		System.out.println("The difference of the Number: " + diff);
	}

	public static void mult() {
		int num5, num6, prod;

		System.out.println("Please Enter The First Number : ");
		num5 = input.nextInt();
		System.out.println("Please Enter The Second Number : ");
		num6 = input.nextInt();
		prod = num5 * num6;
		System.out.println("The product of the numbers are: " + prod);
	}

	public static void div() {
		try {
			double num7, num8, div;
			System.out.println("Enter Your First Number ");
			num7 = input.nextInt();
			System.out.println("Enter Your Second Number ");
			num8 = input.nextInt();
			if (num8 == 0) {
				throw new ArithmeticException("Error attampting to divde a number by zoro");
			}
			// System.out.println("Error: ");
			num8 = input.nextInt();

			div = num7 / num8;
			System.out.println("The quotient is: " + div);

		} catch (ArithmeticException | InputMismatchException ex) {
			System.out.println("Exception: " + ex.toString());
		}

	}

	public static void mod() {
		int num1, num2, sum;
		System.out.print("Enter The First Number: ");
		num1 = input.nextInt();
		System.out.print("\n Enter The Second Number: ");
		num2 = input.nextInt();
		sum = num1 + num2;
		System.out.print("The Sum Of The Numbers is: " + sum);
	}
}
package com.qa.controlflow.javabeginner.iteration;

public class LoopFlowChart {

	public static void forLoop() {
		// TODO Auto-generated method stub
		for (int A = 100; A < 200; A++) {
			System.out.println(A);
		}

	}

	public static void flowChart2() {
		int A = 100;
		do {

			if (A % 2 == 0) {
				System.out.println("_");
				A++;
			} else {
				System.out.println("*");
				A++;
			}
		} while (A <= 200);

	}

	public static void printNumber() {

		for (int A = 1; A <= 10; A++) {
			for (int B = 1; B <= 10; B++) // print 1 up to 10 10 times
			// for (int B=1;B<=A;B++) //print 1 up to 10 B times
			{
				System.out.println(A);
			}
		}

	}

	public static void printValueNumber() {

		for (int A = 1; A <= 10; A++) {
			// for (int B=1;B<=10;B++) //print 1 up to 10 10 times
			for (int B = 1; B <= A; B++) // print 1 up to 10 B times
			{
				System.out.println(A);
			}
		}

	}

}

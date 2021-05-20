package com.qa.controlflow.javabeginner.conditionals;

public class UniqueSum {
	public static int uniquesum(int a, int b, int c) {

		int sum = a + b + c;

		if (a == b && b == c) {
			return 0;
		}

		else if (a == b) {
			return c;
		} else if (b == c) {
			return a;
		} else if (a == c) {
			return b;

		} else {
			return sum;
		}

	}
}

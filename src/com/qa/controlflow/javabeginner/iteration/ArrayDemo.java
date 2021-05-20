package com.qa.controlflow.javabeginner.iteration;

public class ArrayDemo {
	public static void main(String[] args){
		int[] anArray = { 7, 6, 10, 28, 55, 40, 89, 19, 10, 19 }; // declare an array of integers

		// assign a value to each array element and print
		for (int i = 0; i < anArray.length; i++) {

			System.out.println(anArray[i] + " ");

		}
		for (int j = 0; j < anArray.length; j++) {
			System.out.println(anArray[j] * 10);
		}
		System.out.println();

		// STRING ARRAY

		String[] names = { "Amet", "TG", "Mame", "Ahmed", "Mame" };

		for (String name : names) {
			System.out.print(name);
			System.out.print(",");
		}

		// SQUER ARRAY and CUBIC

		int[] arrData = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i < arrData.length; i++) {

			System.out.println(arrData[i] * arrData[i]);
            if(i%2==0) {
            	System.out.println(arrData[i] * arrData[i]);
            }
            if(i%2!=0) {
            	System.out.println(arrData[i] * arrData[i]* arrData[i]);
            }
		}
		for(int i=0; i<5; i++)   
		{   
		for(int j=0; j<=5; j++)   
		{   
		System.out.print("[=]");   
		}   
		System.out.println("[-]"); 
		
		}  
		  
		// EVEN AND ODD NUMBERS
		System.out.println(getEvenNumber(20));
		System.out.println(getEvenNumber(15));

	}

	public static boolean getEvenNumber(int myNumber) {
		if (myNumber % 2 == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
}



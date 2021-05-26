package com.qa.controlflow.javabeginner.scanner;

import java.util.Scanner;

public class ScannerExample {
    
	public static void main(String[] args) {     
	Scanner input = new Scanner(System.in);
    //boolean flag = true;

    int choice;
    while(true){
        System.out.println(" Your Calculator \n");
        System.out.print("1. Addition \n");
        System.out.print("2. Subtraction.\n");
        System.out.print("3. Multiplication.\n");
        System.out.print("4. Division.\n");
        System.out.print("5. Exit\n");
        System.out.print("Select Your choice ");


        choice = input.nextInt();
 

    switch(choice){

    case 1:
//Addition
        int num1, num2, sum;
        System.out.print("Enter The First Number: ");
        num1 = input.nextInt();
        System.out.print("\n Enter The Second Number: ");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.print("The Sum Of The Numbers is: " +sum);
        break;

    case 2: 
    	//Subtraction
        int num3, num4, diff;
        System.out.println("\nPlease Enter The First Number: ");
        num3 = input.nextInt();
        System.out.println("Please Enter The Second Number: ");
        num4 = input.nextInt();
        diff = num3 - num4;
        System.out.println("The difference of the Number: " +diff);
        break;

    case 3:
    	//Product
        int num5, num6, prod;

        System.out.println("Please Enter The First Number : ");
        num5 = input.nextInt();
        System.out.println("Please Enter The Second Number : ");
        num6 = input.nextInt();
        prod = num5 * num6;
        System.out.println("The product of the numbers are: " + prod);
        break;

    case 4: 
        //Division
        double num7, num8, div;
        System.out.println("Enter Your First Number ");
        num7 = input.nextInt();
        System.out.println("Enter Your Second Number ");
        num8 = input.nextInt();
        if(num8 == 0){
            System.out.println("Error: ");
            num8 = input.nextInt();
        }
        div = num7 / num8;
        System.out.println("The quotient is: " +div);
        break;
    case 5: 
        System.out.println("Exit");
        System.exit(0);
         break;
    default :
             System.out.println("Please Select Another");
             break;

    }
   
    }

    }

   }
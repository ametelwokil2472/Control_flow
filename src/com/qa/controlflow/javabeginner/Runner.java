package com.qa.controlflow.javabeginner;
import com.qa.controlflow.javabeginner.conditionals.*;
import com.qa.controlflow.javabeginner.iteration.*;
import com.qa.controlflow.javabeginner.operators.*;
import com.qa.controlflow.javabeginner.strings.*;
public class Runner {

	public static void main(String[] args) {
		// Calculator
		Calculator.add(20, 55);
		Calculator.div(30, 15);
		Calculator.mult(3, 8);
		Calculator.sub(29, 13);
		
//Grade Result class
		 
		Results.displayOverallPassMark();
		
//reate a method which accepts 3 parameters, 2 integers and a boolean.	
		int myNumber = FlowCharts.getAnumber(7, 9, false);
		System.out.println(myNumber); 
		
//Recreate the following flowchart as a project	
FlowCharts.flowchart(6000);

		
//BlackJack		
System.out.println(BlackJack.blackjack(21, 21));	
		
//Unique Sum Given 3 integer values, return their sum.	
		
		System.out.println(UniqueSum.uniquesum(1, 2, 3));
		System.out.println(UniqueSum.uniquesum(3, 3, 3));
		System.out.println(UniqueSum.uniquesum(1, 1, 2));
		
//Conditional, tax class 
		System.out.println(Taxes.getNetIncome(60000)); 
		System.out.println(Taxes.getTax(60000));
		
	//FizzBuzz	
		FizzBuzz.fizzBuzz(100);	
		
//Loop
		Loop.Numbers();
		
//Flow Chart
		
		LoopFlowChart.forLoop();
		LoopFlowChart.printValueNumber();
		 LoopFlowChart.flowChart2();
		 LoopFlowChart.printNumber();
//String
		StringCount.toVerticalWords("Ametelwokil");	
	}

}

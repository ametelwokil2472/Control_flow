package com.qa.controlflow.javabeginner.strings;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myStr1 = "yesterday it was raining ";
		String myStr2 = "today it is sunny, ";
		String myFull = myStr2.concat(myStr1);
		System.out.println(myFull);
		String upper = myFull.toUpperCase();
		System.out.println(upper);
		
		//TODAY IT IS RAINING
		String mySubString1 = myStr2.substring(0, 11);
		 String mySubString2 = myStr1.substring(16, 24);
		 String myStrir4= mySubString1 + mySubString2;
		 System.out.println(myStrir4.toUpperCase());
		
		//How many words there are in a String.
		String myStrir3 = "Amet Fatim hanna mame";
		System.out.println(myStrir3.length());
		
		//String in a vertical fashion 
		StringCount.toVerticalWords("Ametelwokil");
				
		// String has been found in the message.
		String st1 = "My name is Ametelwokil";
		String st2 = "nice";
		System.out.println(StringCount.toMessage(st1, st2));
	}
}

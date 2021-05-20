package com.qa.controlflow.javabeginner.strings;

public class StringCount {
	
//	String in a vertical fashion 

	public static void toVerticalWords(String str) {
	    String [] words = str.split("\\s+");
	    boolean remained = true;

	    for (int j = 0; remained; j++) {
	        remained = false;
	        for (int i = 0; i < words.length; i++) {
	            remained = remained || (words[i].length() > j);
	            System.out.print(words[i].length() > j ? words[i].charAt(j) : " ");
	        }
	        System.out.println();
	    }
}
//	found in the message
	public static boolean toMessage(String message, String word) {
		return  message.contains(word);
	}
}

package com.qa.controlflow.javabeginner.conditionals;

public class FizzBuzz {
	public static void fizzBuzz(int n)
    {
        
       
        for (int i=1; i<=n; i++)                                
        {
            
            if (i%15==0)                                                
                System.out.println("FizzBuzz"+" ");
           
            else if (i%5==0)    
                System.out.println("Buzz"+" ");
 
            
            else if (i%3==0)    
                System.out.println("Fizz"+" ");
                 
            else // print the numbers
                System.out.println(i+" ");                        
        }
    }
}
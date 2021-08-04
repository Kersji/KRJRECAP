package com.natwest.iterations;

public class Fizzbuzz {

	public static void fizzBuzz(int num) {
		
		int mod3 = 0;
		int mod5 = 0;
		
		for (int i=1; i<=num; i++) {
			
			mod3 = i%3;
			mod5 = i%5;
			
			if (mod3 == 0 && mod5 == 0) {
				System.out.println(i + " FizzBuzz");
			} else if (mod3 == 0) {
				System.out.println(i + " Fizz");
			} else if (mod5 == 0) {
				System.out.println(i + " Buzz");
			} else {
				System.out.println(i);
			}
						
		}
				
	}
	
}
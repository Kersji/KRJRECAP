package com.natwest.operators;

public class Runner {

	public static void main(String[] args) {
	
		System.out.println(Conditionals.add(5, 8));
		System.out.println(Conditionals.subtract(9, 8));
		System.out.println(Conditionals.subtract(7, 10));
		System.out.println(Conditionals.multiply(8, 9));
		System.out.println(Conditionals.divide(6, 3));
		System.out.println(Conditionals.divide(20, 0));
		System.out.println(Conditionals.divide(4, 3));
		System.out.println("-------------------------------");
		
		System.out.println(Conditionals.add2(5, 8, true));
		System.out.println(Conditionals.add2(5, 8, false));
		System.out.println(Conditionals.subtract2(9, 8, true));
		System.out.println(Conditionals.subtract2(9, 8, false));
		System.out.println(Conditionals.subtract2(7, 10, true));
		System.out.println(Conditionals.multiply2(8, 9, true));
		System.out.println(Conditionals.multiply2(8, 9, false));
		System.out.println(Conditionals.divide2(25, 5, true));
		System.out.println(Conditionals.divide2(4, 3, false));
		System.out.println(Conditionals.divide2(20, 0, true));
		System.out.println("-------------------------------");
				
		System.out.println(Conditionals.add3("four", "six", true));
		System.out.println(Conditionals.add3("four", "six", false));
		System.out.println(Conditionals.add3("four", "ten", true));
		System.out.println(Conditionals.add3("ten", "four", true));
		System.out.println(Conditionals.subtract3("9", "8", true));
		System.out.println(Conditionals.subtract3("9", "8", false));
		System.out.println(Conditionals.subtract3("7", "10", true));
		System.out.println(Conditionals.multiply3("8", "9", true));
		System.out.println(Conditionals.multiply3("8", "9", false));
		System.out.println(Conditionals.divide3("25", "5", true));
		System.out.println(Conditionals.divide3("4", "3", false));
		System.out.println(Conditionals.divide3("20", "0", true));
		System.out.println("-------------------------------");
				
	}
	
}

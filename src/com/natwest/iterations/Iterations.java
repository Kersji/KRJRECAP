package com.natwest.iterations;

public class Iterations {

	public static void iter02() {
		int a = 2;
		
		do {
			if (a%2 == 0) {
				System.out.println(a + " - ");
			} else {
				System.out.println(a + " * ");
			}
			a++;
		} while (a<=10);
 	
	}
	
	public static void iter03() {
		for (int i=1 ; i<=3; i++ ) {
			for (int j=1 ; j<=10; j++) {
				System.out.println(i + " - " + j);
			}
		}
	}
	
	public static void iter05() {
		for (int i=1 ; i<=3; i++ ) {
			for (int j=1 ; j<=i; j++) {
				System.out.println(i + " - " + j);
			}
		}
	}
	
	public static void coins(float cost, float paid) {
		
		float change = paid - cost;
				
		float[] notes = {50, 20, 10, 5, 2, 1, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f};
		
		System.out.println("Change = " + change);
				
		for( float typeNotes : notes ) {
			change = calcChange(change, typeNotes);
		}
				
	}
	
	public static float calcChange(float change, float note) {
		
		float rem=0;
		int num=0;
		int typeNotes;
	
		rem = change%note;
		num = (int) ((change - rem) / note);
		
		if (num > 0) {
			
			if (note >=1 ) {
				
				typeNotes = (int) note;
				System.out.println(num + " £" + typeNotes + " note");
				
			} else {
				
				typeNotes = (int) (note*100);
				System.out.println(num + " " + typeNotes + "p");
				
			}
		}
		
		return rem;
	}
	
	public static void modulus(double num1, double num2) {
		
		double rem;
		double factor;
		
		rem = num1%num2;
		factor = (num1 - rem) / num2;
		System.out.println("Remainder = " + rem);
		System.out.println("Factor = " + factor);
	}
	
}
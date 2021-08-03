package com.natwest.operators;

public class Conditionals {

	public static String add (int num1, int num2) {
		int val = num1 + num2;
		return (num1 + " + " + num2 + " = " + val);		
	}
	
	public static String subtract (int num1, int num2) {
		int val = 0;
		String msg = "";
		 
		if (num1 > num2) {
			val = num1 - num2;
			msg = num1 + " - " + num2 + " = " + val;	
		} else {
			msg = num1 + " - " + num2 + " : Subtraction cannot be done";
		}
		return (msg);		
	}
	
	public static String multiply (int num1, int num2) {
		int val = num1 * num2;
		return (num1 + " * " + num2 + " = " + val);		
	}
	
	public static String divide (float num1, float num2) {
		float val = 0;
		String msg = "";
		
		if (num2 != 0) {
			val = num1 / num2;
			msg = num1 + " / " + num2 + " = " + val;	
		} else {
			msg = num1 + " / " + num2 + " : Divison by 0 not possible";
		}
		return (msg);	
	}
	
	public static String add2 (int num1, int num2, boolean twice) {
		int val = num1 + num2;
		String msg;
		
		if (twice == true) {
			val += num2;
			msg = num1 + " + " + num2 + " + " + num2 + " = " + val; 
		} else {
			msg = num1 + " + " + num2 + " = " + val; 
		}
		return (msg);		
	}
	
	public static String subtract2 (int num1, int num2, boolean twice) {
		int val = 0;
		String msg = "";
		 
		if (num1 > num2) {
			val = num1 - num2;
			msg = num1 + " - " + num2 + " = " + val;	

			if (twice == true) {
				val  -= num2;
				msg = num1 + " - " + num2 + " - " + num2 + " = " + val;				
			}
						
		} else {
			msg = num1 + " - " + num2 + " : Subtraction cannot be done";
		}
		return (msg);		
	}
	
	public static String multiply2 (int num1, int num2, boolean twice) {
		int val = num1 * num2;
		String msg;
		
		if (twice == true) {
			val *= num2;
			msg = num1 + " * " + num2 + " * " + num2 + " = " + val; 
		} else {
			msg = num1 + " * " + num2 + " = " + val; 
		}
		return (msg);		
	}		
	
	public static String divide2 (float num1, float num2, boolean twice) {
		float val = 0;
		String msg = "";
		
		if (num2 != 0) {
			val = num1 / num2;
			msg = num1 + " / " + num2 + " = " + val;	
			
			if (twice == true) {
				val  /= num2;
				msg = num1 + " / " + num2 + " / " + num2 + " = " + val;				
			}
										
		} else {
			msg = num1 + " / " + num2 + " : Divison by 0 not possible";
		}
		return (msg);	
	}
	
	public static String add3 (String num3, String num4, boolean twice) {
		int num1 = stringToInt(num3);
		int num2 = stringToInt(num4);
		int val = num1 + num2;
		String msg;
		
		if (twice == true) {
			val += num2;
			msg = num1 + " + " + num2 + " + " + num2 + " = " + val; 
		} else {
			msg = num1 + " + " + num2 + " = " + val; 
		}
		return (msg);		
	}
	
	public static String subtract3 (String num3, String num4, boolean twice) {
		int num1 = Integer.parseInt(num3);
		int num2 = Integer.parseInt(num4);
		int val = 0;
		String msg = "";
		 
		if (num1 > num2) {
			val = num1 - num2;
			msg = num1 + " - " + num2 + " = " + val;	

			if (twice == true) {
				val  -= num2;
				msg = num1 + " - " + num2 + " - " + num2 + " = " + val;				
			}
						
		} else {
			msg = num1 + " - " + num2 + " : Subtraction cannot be done";
		}
		return (msg);		
	}
	
	public static String multiply3 (String num3, String num4, boolean twice) {
		int num1 = Integer.parseInt(num3);
		int num2 = Integer.parseInt(num4);
		int val = num1 * num2;
		String msg;
		
		if (twice == true) {
			val *= num2;
			msg = num1 + " * " + num2 + " * " + num2 + " = " + val; 
		} else {
			msg = num1 + " * " + num2 + " = " + val; 
		}
		return (msg);		
	}		
	
	public static String divide3 (String num3, String num4, boolean twice) {
		float num1 = Float.parseFloat(num3);
		float num2 = Float.parseFloat(num4);
		float val = 0;
		String msg = "";
		
		if (num2 != 0) {
			val = num1 / num2;
			msg = num1 + " / " + num2 + " = " + val;	
			
			if (twice == true) {
				val  /= num2;
				msg = num1 + " / " + num2 + " / " + num2 + " = " + val;				
			}
										
		} else {
			msg = num1 + " / " + num2 + " : Divison by 0 not possible";
		}
		return (msg);	
	}
	
	public static int stringToInt (String stringNum) {
		int num;
		
		if (stringNum == "one") {
			num = 1;				
		} else if (stringNum == "two") {
			num = 2;				
		} else if (stringNum == "three") {
			num = 3;				
		} else if (stringNum == "four") {
			num = 4;				
		} else if (stringNum == "five") {
			num = 5;
		} else if (stringNum == "six") {
			num = 6;
		} else if (stringNum == "seven") {
			num = 7;
		} else if (stringNum == "eight") {
			num = 8;
		} else if (stringNum == "nine") {
			num = 9;
		} else {
			num = 0;
		}
		return num;
	}
		
}

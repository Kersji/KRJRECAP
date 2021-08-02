package com.natwest.flowcontrol;

public class FlowControl {

	public static void function01(String msg, int num){
		
		int level=num+1;
		
		System.out.println(msg+ " - Level "+level);
		System.out.println("Funtion01 starts");
		function02("I am coming from function01 to function02", level);
		System.out.println("Funtion01 ends");
		
	}
	
	public static void function02(String msg, int num) {
		
		int level=num+1;
		
		System.out.println(msg+ " - Level "+level);
		System.out.println("Funtion02 starts");
		function03("I am coming from function02 to function03", level);
		System.out.println("Funtion02 ends");	
		
	}
	
	public static void function03(String msg, int num) {
		
		int level=num+1;
		
		System.out.println(msg+ " - Level "+level);
		System.out.println("Funtion03 starts");
		System.out.println("I am now in function03- Hooray");
		System.out.println("Funtion03 ends");
		
	}
}
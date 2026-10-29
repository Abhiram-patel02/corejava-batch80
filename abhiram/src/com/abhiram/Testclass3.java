package com.abhiram;

public class Testclass3 {
	
	Testclass3 test = new Testclass3();
	
	static {
	        System.out.println("static block called1");
	}
	{
		System.out.println("instance block called");
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		  
		System.out.println("main method ended");
		

	}
	static {
		System.out.println("static block called2");
	}
}

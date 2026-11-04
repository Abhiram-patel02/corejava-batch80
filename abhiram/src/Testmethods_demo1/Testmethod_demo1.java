package Testmethods_demo1;

public class Testmethod_demo1 {
	
	public static void hello() {
		System.out.println ("hello abhiram");
	}
	
	void welcome() {
		System.out.println("welcomr to java world");
	}

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Testmethod_demo1 d1 = new Testmethod_demo1();
		Testmethod_demo1 e1 = new Testmethod_demo1();
       hello();
       e1.welcome();
		
		System.out.println("main method ended");
	}

}

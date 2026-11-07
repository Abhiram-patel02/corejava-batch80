package com.languagefundamentls.methods;

public class Testmethodsdemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		hello();//calling the method:static methods can call loads directly
		Testmethodsdemo1 t1 = new Testmethodsdemo1 ();
		t1.welcome();
		System.out.println("main method ended");
	}
		public static void hello() {
			System.out.println("good morning");
			}
		void welcome() {
			System.out.println("hello everyoun");
		}
}

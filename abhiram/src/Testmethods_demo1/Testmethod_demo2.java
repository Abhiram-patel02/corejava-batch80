package Testmethods_demo1;

public class Testmethod_demo2 {


	public static void main(String[] args) {
		
		System.out.println("main method started");
		method1();
		
		System.out.println("main method ended");

	}
	public static void method1() {
		method2();
		System.out.println("my self abhiram");
	}
      static void method2() {
    	  method4();
    	   System.out.println("i love development");
       }
      static void method3() {
    	  System.out.println("i recently completed BCA");
      }
           
      static void method4() {
    	  method3();
    	  System.out.println("hello everyone");
      }
}

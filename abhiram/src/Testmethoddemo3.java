   //import java.util.Scanner;

public class Testmethoddemo3 {
	static void addition(int a ,int b) {
    	System.out.println("additon method called");
    	System.out.println("sum of two numbers ="+(a+b));
    }
	static void substraction(float a,int b) {
    	System.out.println("substraction method called");
    	System.out.println("sum of two numbers ="+(a-b));
	}
	static void multiplication(int a ,int b) {
    	System.out.println("multiplication method called");
    	System.out.println("sum of two numbers ="+a*b);
	}
	static void devision(int a ,int b) {
    	System.out.println("devison method called");
    	System.out.println("sum of two numbers ="+a/b);
	}

       public static void main(String[] args) {
		System.out.println("main method started");
		//Scanner sc = new Scanner(System.in);
		addition(30,45);
		substraction (80,20);
        multiplication(30,20);
        devision(100,20);
	}
	
}

import java.util.Scanner;
public class Testmethoddemo4 {
	
	static void additon(int a ,int b) {
		   System.out.println("sum of two numbers ="+(a+b));
	}
	static void substrsction(int x ,int y) {
		   System.out.println("sub of two numbers ="+(x-y));
		   }
	static void multiplacation(float x,int y,float z){
		System.out.println("mul of two num="+ x*y/z);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter a number");
		int a = sc.nextInt();
		System.out.println("enter b number");
		int b = sc.nextInt();
		additon(a,b);
		
		System.out.println("enter a number");
		int x =sc.nextInt();
		System.out.println("enter b number");
		int y = sc.nextInt();
		substrsction(x,y);
		
		System.out.println("enter x num");
		float q = sc.nextFloat();
		System.out.println("enter y num");
		int w = sc.nextInt();
		System.out.println("enter z num");
		float e = sc.nextFloat();
		multiplacation(q,w,e);
	}
   
}

// a simple poc on matrimoney managment//

package Logicalstatements;
 import java.util.Scanner;
public class Matrimony {

	public static void main(String[] args) {
		System.out.println("welcome to V CUBE matrimony");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.nextLine();
		
		System.out.println("enter your asets");
		double asets = sc.nextDouble();
		
		if (asets >500000000) {
			System.out.println("ho nice");
			System.out.println("lets continu the chat");
		}
		   System.out.println("enter your age ");
		   int age = sc.nextInt();
		   if (age >=23 && age <=30) {
			   System.out.println("ok good to go complete some basic details");
		   }	     
			   System.out.println("enter your gender");
			      String gen = sc.next();
              System.out.println("enter your hight and weight");
		      float hight = sc.nextFloat();
		      double weight = sc.nextDouble();
		      sc.nextLine();
		      
		      System.out.println("enter your education qulification like 10 th ,12 th ,graduation,masters  ");
		       String edu = sc.nextLine();
		       if (edu.equalsIgnoreCase("graduation")|| 
		    		   edu.equalsIgnoreCase("masters")) {
		    	 System.out.println("u can continue");  
		        
		    	 
		       }
		       System.out.println("enter your job status like employed or unemployed");
		       String job = sc.next();
		       if (job.equalsIgnoreCase("employed")) {
		    	   System.out.println("yeha that sounds good");
		    	System.out.println("enter your salary");
		    	double sal = sc.nextDouble();
		       if (sal >250000) {
		    	   System.out.println("u are right fit lets find profiles that matchs u");
		       }
		else {
			System.out.println("u are unfit for marriage");
		}
		       }
	}
		   



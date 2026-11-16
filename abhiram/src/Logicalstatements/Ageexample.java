package Logicalstatements;
import java.util.Scanner;
//write a program to print age wise your generation
public class Ageexample {
	
	
	public static void main(String[]args) {
		System.out.println("main method started");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your age");
		double age = sc.nextDouble();
		 
		if (age >60) {
			System.out.println("you are old age or senior  citegen");
		}else if(age >= 36 && age <60) {
			System.out.println("you are ion middele age");
		}else if (age >= 20 && age <35) {
			System.out.println("you are genz");
		}else if(age >=13 && age<19) {
			System.out.println("you are teen age");
		}else if (age >=5 && age <12) {
			System.out.println("you are children");
		}else if (age>=0 && age <5) {
			System.out.println("you are kid");
		}
	}	

}

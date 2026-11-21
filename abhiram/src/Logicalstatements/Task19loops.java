//1.Write a Java program to print all even numbers between 1 and 50.
//2.Write a Java program to find the sum of numbers from 1 to 100.
//3.Write a Java program to print the multiplication table of a given number.
//4.Write a Java program to print all factors of a given number.
package Logicalstatements;
import java.util.Scanner;
public class Task19loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("print all even numbers");
		int even = sc.nextInt();
		for (int i = 0 ;i <= 50; i++) {
		  if ( i % 2 ==0 ) {
			  System.out.println(i);
		  }
			  
		  }
	}
}

	



//2.Write a Java program to find the sum of numbers from 1 to 100.
package Logicalstatements;
import java.util.Scanner;
public class Taskloops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("enter a limit:");
		for (int i = 1;i<=100;i++) {
			sum = sum +i;
			System.out.println("sum ="+ sum);
			sc.close();
		}

	}

}

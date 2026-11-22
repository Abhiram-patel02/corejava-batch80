package Logicalstatements;
import java.util.Scanner;
//4.Write a Java program to print all factors of a given number.

public class Factors {
	 
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Number: ");
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					System.out.println(i);
				}
			}

		}

	}

		

	



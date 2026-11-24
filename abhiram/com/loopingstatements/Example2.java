package com.loopingstatements;
import java.util.Scanner;
public class Example2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();

		int f = fact(n);
		System.out.println("factorial of the given number is: " + f);
	}

	static int fact(int n) {
		int fact = 1;

		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}

		return fact;
	}

}
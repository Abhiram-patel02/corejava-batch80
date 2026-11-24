package com.loopingstatements;
import java.util.Scanner;

public class Example1 {
// MultiplicationTable
//WAP to print math table ..?

//If your input is 9
//your output should be
//9X1 = 9
//9X2 = 18
//9X3 = 27
//9X4 = 36
//9X5 = 45
//9X6 = 54
//9X7 = 63
//9X8 = 72
//9X9 = 81
//9X10 = 90
public class Example8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number which you want Calculate: ");
		int num = sc.nextInt(); // 9
		
		System.out.print("How may values you want print: ");
		int val = sc.nextInt(); // 10 or 20 or 30

		for (int i = 0; i <= val; i++) {
			System.out.println(num + " X " + i + " = " + num * i);

		}

	}

}
}
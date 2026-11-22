package com.logicalstatements.loops;

		import java.util.Scanner;

		//1.Write a Java program to print all even numbers between 1 and 50.

public class Event1to2 {

	public class Even_1to50 {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);

				System.out.println("Even Numbers from (1 to 50)");

				for (int i = 1; i <= 50; i++) {
					if (i % 2 == 0) {
						System.out.println(i);

					}
				}
			}

		}

	}



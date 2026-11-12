package Logicalstatements;

import java.util.Scanner;

public class Drivinglicence {

	public static void main(String[] args) {
		System.out.println("hey man enter your age ...?");
		Scanner sc = new Scanner(System.in);
		double dvlicence = sc.nextDouble();
		if(dvlicence>20) {
			System.out.println("heyy u are eligible for licence");
			System.out.println("take care of your self ");
	}
		else {
			System.out.println("are pilla puka pakaku poyy adukoo");
		}
		

	}

}

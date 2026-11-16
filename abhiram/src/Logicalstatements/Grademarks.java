package Logicalstatements;

import java.util.Scanner;
//write a program to print the grade based on marks and parcentage

public class Grademarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your persentage");
		double marksp = sc.nextDouble();
		
		if (marksp > 100 && marksp < 0) {
			System.out.println("invalid marks");
		}else if(marksp>=90) {
			System.out.println("grade A");
		}else if(marksp>=75) {
			System.out.println("grade B");
		}else if (marksp>=60) {
			System.out.println("grade C");
		}else if(marksp<36) {
			System.out.println("you are fail");
		}else {
			System.out.println("i think u have not came to exam");
		}

	}

}

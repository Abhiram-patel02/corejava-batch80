package com.loopingstatements;
import java.util.Scanner;

public class Palandromes {
public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        int original = number;   // keep a copy
	        int reverse = 0;

	        while (number > 0) {
	            int digit = number % 10;          // get last digit
	            reverse = reverse * 10 + digit;   // add digit to reverse
	            number = number / 10;             // remove last digit
	        }

	        if (original == reverse) {
	            System.out.println(original + " is a palindrome");
	        } else {
	            System.out.println(original + " is not a palindrome");
	        }

	        sc.close();
	    }
	}

package com.loopingstatements;
import java.util.Scanner;

// print all even and odd numbers from 1 to 10
public class simplepr2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		for(int i = 0;i<n;i++) {
		
		if(i%2 != 0) {
			System.out.println(i);
		}
			

	}

}
}
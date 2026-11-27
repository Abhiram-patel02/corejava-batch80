package com.loopingstatements;
import java.util.Scanner;
//write a program to print the given number is perfect number or not
//ex:6->123 =6 true
//ex:28->1247 14=28 true
//ex:24->1234568 12 =36 -false
public class Perfectnumber {
	
	static boolean isperfect(int n) {
		 boolean per = false;
		 int sum = 0;
		 
		 for(int i = 1;i<n;i++) {
			 if(n%i==0) {
				 sum = sum +i;
				 }
		 }
		 if(sum==n) {
			 per=true;
		 }
		return per;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number");
		int n =sc.nextInt();
		boolean per=isperfect(n);
		if(per) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}

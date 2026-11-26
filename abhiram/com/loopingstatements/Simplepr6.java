package com.loopingstatements;
//write a simple for loop for finding sum of even numbers from 1 to 20 
public class Simplepr6 {

	public static void main(String[] args) {
	
		int sum = 0;
		
		for (int i = 1;i<=20;i++) {
			if ( i%2  == 0) {
				
				sum = sum +i;
		  }	
		}
		System.out.println(sum);

	}

}

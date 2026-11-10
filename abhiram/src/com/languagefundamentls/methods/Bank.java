package com.languagefundamentls.methods;
import java.util.Scanner;
public class Bank {
	 double balance = 25000;

	public static void main(String[] args) {
		System.out.println("main method started");
		Bank b1 = new Bank();
		//b1.totalbalance();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amout how much u want to deposit");
		double dep = sc.nextDouble();
		b1.deposit(dep);

		System.out.println("enter amout how much u want to witdraw");
		double wed = sc.nextDouble();
		b1.withdraw(wed);
     }	
	void totalbalance() {
		System.out.println("your total balance is="+balance);
	}
    void deposit(double dep) {
    	balance =(balance+ dep);
    	totalbalance();
    }
	void withdraw(double wed) {
		balance=(balance-wed);
		totalbalance();
	}

}

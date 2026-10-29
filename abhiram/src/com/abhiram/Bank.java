package com.abhiram;

public class Bank {
    
	static String bankname = "sbi";
	
	int Acno ;
	int balance ;
	String holdername ;
	
	public static void main(String[] args) {
		System.out.println(bankname);
       
		Bank bank = new Bank();
		
		bank.Acno = 994882576;
		bank.balance  = 10000;
		bank.holdername = "Abhiram";
		bank.display();
	}		
		public void display() {
		System.out.println("Acno :" +Acno);
		System.out.println("balance :" +balance);
		System.out.println("holdername :" +holdername);
	}
	

}

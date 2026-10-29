package com.abhiram;

public class Jvm09 {
	
	int studentid;
	String studentname;

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Jvm09 j1 = new Jvm09();
		
		Jvm09 j2 = new Jvm09();

		
		Jvm09 j3 = new Jvm09();
		
		j1.studentid = 101 ;
		j1.studentname ="argon";
        j2.studentid =102;
        j2.studentname = "astra";
        
        System.out.println( j1.studentid);
		System.out.println( j2.studentname);

		System.out.println("main method started");

	}

}

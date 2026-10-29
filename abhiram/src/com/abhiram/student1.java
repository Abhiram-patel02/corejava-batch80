package com.abhiram;

public class student1 {
	
	static String collagename;
	
	int studentid;
	String studentname;
	String coursename;
	int marks;
	String principal;
	
	void displaystudent() {
		System.out.println("Studentid :"+studentid);
		System.out.println("studentname :"+studentname);
		System.out.println("marks :"+marks);
		System.out.println("coursename :"+coursename);
		}
	
	void displaycollage() {
		System.out.println("principal :"+principal);
		System.out.println("collagename :"+collagename);
	}
	
	void changeprincipal() { 
		principal = "suresh";
	}
	public static void main(String[] args) {
		
		student1 st1 = new student1();
		
		st1.studentid = 111 ;
		st1.studentname = "Abhiram" ;
		st1.coursename = "javafullstack" ;
		st1.marks = 99 ;
		st1.principal = "sriram" ;
		collagename = "jntu";
		
		st1.displaystudent();
		st1.displaycollage();
		st1.changeprincipal();
		st1.displaycollage();
		
		
    
	}

}

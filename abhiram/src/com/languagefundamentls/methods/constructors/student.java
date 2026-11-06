package com.languagefundamentls.methods.constructors;
//1.Create a Student class with studentId, studentName and marks.

//Initialize all variables using a no-argument constructor.
//Display student details by calling a method in the main method.

public class student {

	int studentId;
	String studentname;
	int marks;

	student() {
		System.out.println("no arguments constructor");
		
		studentId =23;
		studentname = "abhiram";
		marks = 99;
		
	}
	public static void main() {
		System.out.println("main method started");
		student s1 = new student();
		s1.abhi();
		suresh();
		
	}
	void abhi() {
		System.out.println(studentId);
		System.out.println(studentname);
		System.out.println(marks);
	}
	public static void suresh() {
		System.out.println("main method ended");
		
	}

}

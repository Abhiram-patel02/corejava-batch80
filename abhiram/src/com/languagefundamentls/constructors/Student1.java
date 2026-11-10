package com.languagefundamentls.constructors;
/*1.Write a Java program to create a Student class
with fields studentId, studentName, and course.
Initialize the data using a parameterized constructor 
and create another object by copying the values of the first object using a copy constructor.
Display the details of both objects.?*/
   public class Student1 {
	   static int studentId ;
	   static String stname;
	   static String course;
	   
   Student1(int studentId,String stname,String course){
	   System.out.println("parameterized constructors called");
	   this.studentId = studentId;
	   this.stname = stname;
	   this.course = course;
   }
	   
	   Student1(Student1 c){
		   System.out.println("parameterized constructors called");
		   this.studentId = c.studentId;
		   this.stname = c.stname;
		   this.course = c.course;

 }
	public static void main(String[] args) {
		Student1 s1 = new Student1(10479,"qwerty","bca");
		s1.Stinformation();
		Student1 s2 = new Student1(s1);
		s2.studentId = 10478;
		s2.Stinformation();

	}
	
	 void Stinformation(){
		System.out.println("student id is="+studentId);
		System.out.println("student name is="+stname);
		System.out.println("student course is="+course);
		System.out.println("*******************************");
		
	}

}

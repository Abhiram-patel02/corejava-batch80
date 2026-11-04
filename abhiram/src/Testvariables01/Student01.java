package Testvariables01;

public class Student01 {
     
	static String collagename = "nishita";
	String stname = "abhiram";
	
	void stdata () {
		int marks =90;
		System.out.println(collagename);
		System.out.println(stname);
		System.out.println(marks);
	
	}
	public static void main(String[] args) {
		
		Student01 st1 = new Student01();
		st1.stdata();

	}

}

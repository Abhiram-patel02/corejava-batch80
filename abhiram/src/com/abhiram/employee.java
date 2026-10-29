package com.abhiram;

public class employee {
	
	
	static String companiname="wipro";
	
	int eid;
	String ename;
	String departname;
	int salary;

	public static void main(String[] args) {
		System.out.println("main mathod started");
		
		employee emp = new employee();
		emp.eid = 121;
		emp.ename = "abhiram";
		emp.departname = "qwerty";
		emp.salary = 1200;
		
		System.out.println(emp.eid);
		System.out.println(emp.ename);
		System.out.println(companiname);
		System.out.println(emp.departname);
		System.out.println(emp.salary);
		

	}

}

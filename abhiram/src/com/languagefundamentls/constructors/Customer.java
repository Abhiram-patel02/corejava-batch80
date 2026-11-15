package com.languagefundamentls.constructors;
class person{
	String name;
	int age;
	String city;
	person(String name,int age,String city){
		System.out.println("no arg constructor called from person");
	}
	public static void main(String[]args) {
		System.out.println("main method started from person");
	}
}
public class Customer extends person{
	//implicit super constructor person()is undefined.must explicity invoke
	//another constructor
    Customer(){
    	super("abhiram",22,"HYD");
    	System.out.println("no arg constructor called from customer");
    }
	public static void main(String[] args) {
		System.out.println("main method called from customer");
          Customer c = new Customer();
	}

}

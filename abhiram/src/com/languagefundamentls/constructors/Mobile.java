package com.languagefundamentls.constructors;

class Product{
	String model;
	double price;
	String brand;
	String colour;
	
	Product(){
		System.out.println("defoult constructor called from product");
		
	}
	
	public static void main(String[]args) {
		System.out.println("main method started from product");
	}
}
public class Mobile {
      Mobile(){
    	  System.out.println("no arg constructor called mobile");
      }
      Mobile(String model,int price,String brand ,String colour){
    	  super.model = model;
    	  super.price = price;
    	  super.brand = brand;
    	  super.colour = colour;
      }
     	public static void main(String[] args) {
		System.out.println("main method started from Mobile");
         Mobile m = new Mobile();
         m.details();
         Mobile m1 = new Mobile("i phone17 pro max",300000000,"i phone","black");
         m1.details();
	}
    void details() {
    	System.out.println("model of the car"+model);
    	System.out.println("price of the car"+price);
    	System.out.println("brand of the car"+brand);
    	System.out.println("colour of the car"+colour);
    }
}

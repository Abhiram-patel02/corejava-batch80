package com.languagefundamentls.constructors;
//super class/parent/base
class Product{
	String model;
	double price;
	String brand;
	String colour;
	
	Product(){
		System.out.println("no arg constructor called from product");
		
	}
	Product(String model,int price){
		System.out.println("two arg parameterised constructor called product");
		this.model = model;
		this.price = price;
	}
	public static void main(String[]args) {
		System.out.println("main method started from product");
	}
}
//sub-class/child/derived
//mobile is a product
//in java to achieve inheritance,we use extends keyword
//
public class Mobile extends Product {
	
	//whenever we extends parent class
	//automatically the child class the super class constructor implicity
    //if we dont call 
	Mobile(){
    	  super();
    	  System.out.println("no arg constructor called mobile");
      }
      Mobile(String model,int price,String brand ,String colour){
    	  super.model = model;
    	  super.price = price;
    	  super.brand = brand;
    	  super.colour = colour;
      }
      Mobile(String model,int price){
    	  super(model,price);
  		System.out.println("two arg parameterised constructor called mobile");


      }
     	public static void main(String[] args) {
		System.out.println("main method started from Mobile");
         Mobile m = new Mobile();
         m.details();
         Mobile m1 = new Mobile("i phone17 pro max",3000000,"i phone","black");
         m1.details();
         Mobile m2 = new Mobile("samsang",200000000);
         m2.details();
	}
    void details() {
    	System.out.println("model of the mobile ="+model);
    	System.out.println("price of the mobile ="+price);
    	System.out.println("brand of the mobile =" +brand);
    	System.out.println("colour of the mobile ="+colour);
    	System.out.println("********************************");
    }
}

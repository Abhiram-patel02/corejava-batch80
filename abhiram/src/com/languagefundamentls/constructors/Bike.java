package com.languagefundamentls.constructors;

public class Bike {
	
	String model;
	String brand;
	double price;
	String colour;
	
	Bike(){
		System.out.println("no arg counstructer called");
		this("unknown");
	}
	public Bike(String model) {
		this(model,"unknown");
	}
	public Bike(String model,String brand) {
		this(model,brand,50000000);
	}
	public Bike(String model,String brand,double price) {
	 this (model,brand,price,"blue");
	}
	
	Bike(String model,String brand,double price,String colour){
		this.model=model;
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}

	public static void main(String[] args) {
	  System.out.println("main method started");
	  Bike b1 = new Bike();
	  b1.bikefeature();

	}
   void bikefeature() {
	   System.out.println("model of the bike="+model);
	   System.out.println("model of the bike="+brand);
	   System.out.println("model of the bike="+price);
	   System.out.println("model of the bike="+colour);

	   
   }
}

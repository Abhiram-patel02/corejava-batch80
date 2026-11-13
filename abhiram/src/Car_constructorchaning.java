
public class Car_constructorchaning {
	
	String model;
	String brand;
	double price;
	String colour;
	
	Car_constructorchaning(){
		System.out.println("defoult construcror called");
		model = "unknown";
		brand = "unknown";
		price = 00000000;
		colour = "unknown";
	}
	Car_constructorchaning(String model,String brand,double price,String colour){
		System.out.println("parameterised constructor called");
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}
	Car_constructorchaning(String model2,String brand2,double price2,String colour2){
		System.out.println("parameterised constructor called");
		this.model = model2;
		this.brand = brand2;
		this.price = price2;
		this.colour = colour2;
	}


	public static void main(String[] args) {
		System.out.println("main method started");
		Car_constructorchaning d1 = new Car_constructorchaning();
		Car_constructorchaning d2 = new Car_constructorchaning("soneta","kia",500000,"black");
		Car_constructorchaning d3 = new Car_constructorchaning("soney","samsang",40000,"blue");

		d1.carinfo();
		d2.carinfo();
		d3.carinfo();

	}
    void carinfo() {
    	System.out.println("model of the car ="+model);
    	System.out.println("brand of the car ="+brand);
    	System.out.println("price of the car ="+price);
    	System.out.println("colour of the car ="+colour);
    	System.out.println("****************************");
    }
}

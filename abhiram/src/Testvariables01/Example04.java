package Testvariables01;

public class Example04 {
	
	static int count =0;
	
	void increment() {
		count ++;
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		Example04 c1 = new Example04();
		Example04 c2 = new Example04();
		
		c1.increment();
		c2.increment();
		c1.increment();


	}

}

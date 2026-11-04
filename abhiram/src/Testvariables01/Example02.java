package Testvariables01;

public class Example02 {
      
	static int a = 10;
	int b = 20;
	void data() {
		int c =30;
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Example02 q1 = new Example02();
		q1.data();

	}

}

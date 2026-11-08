
public class Testmethoddemo2 {
	
	void addition() {
		System.out.println("addition method called");
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}
	void substraction() {
		System.out.println("substraction method called");
		int a = 100;
		int b = 30;
		System.out.println(a-b);
	}
	void multipalcation() {
		System.out.println("multipleacation called");
		int a = 80;
		int b = 20;
		System.out.println(a*b);
	}
	void devison() {
		System.out.println("devison method called");
		int a = 80;
		int b = 20;
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		System.out.println("main method called");
		Testmethoddemo2 t2 = new Testmethoddemo2();
		t2.addition();
		t2.substraction();
		t2.multipalcation();
		t2.devison();
		System.out.println("main method ended");
	}
	}



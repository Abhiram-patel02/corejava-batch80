package Testblocks_01;

public class Testbocks {
	
	//Testbocks t1 = new Testbocks();
	
        static {
        	System.out.println("hello sresta");
        } 
        
        Testbocks t1 = new Testbocks();

        {
        	System.out.println("what are u doing");
        }
	public static void main(String[] args) {
		System.out.println("main mathod started");
		
		//Testbocks t1 = new Testbocks();
		System.out.println("main method ended");

	}
	static {
		System.out.println("how are u");
	}

}

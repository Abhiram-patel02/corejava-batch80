package Testvariables01;

public class Example03 {
	
	static String companiname = "google";
    String employee = "abhiram";
    int salary = 45000;
    
    void abhi(){
    	int bonus = 2500;
    	System.out.println("main method started");
    	System.out.println(companiname);
    	System.out.println(employee);
    	System.out.println(salary+bonus);
    }
	public static void main(String[] args) {
		Example03 t1 = new Example03();
		t1.abhi();
		Example03 t2 = new Example03();
		t2.abhi();
		

	}

}

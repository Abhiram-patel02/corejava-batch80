package Testvariables01;

public class Testvariables01 {
	
	static int collno ;
	static String collagename ;
	static int pincode ;
	
	String name;
	int rollnum;
	int age;
	
	public static void main(String[] args) {
		collno = 98;
		collagename = "kakatiya collage";
		pincode = 500072;
       int marks = 99;
      
       
		Testvariables01 t1 = new Testvariables01();
		t1.name = "abhiram";
		t1.rollnum =10479;
		t1.age = 22;
		
		System.out.println(collno);
		System.out.println(collagename);
		System.out.println(pincode);
		System.out.println( t1.name);
		System.out.println(t1.rollnum);
		System.out.println(t1.age);
		System.out.println(marks);

		System.out.println("********************************"); 
		Testvariables01 t2 = new Testvariables01();
		t2.name = "sravan";
		t2.rollnum =10489;
		t2.age = 23;
		
		System.out.println(collno);
		System.out.println(collagename);
		System.out.println(pincode);
		System.out.println( t2.name);
		System.out.println(t2.rollnum);
		System.out.println(t2.age);
		System.out.println("********************************"); 
		
		System.out.println(Testvariables01.collno);
		System.out.println(Testvariables01.collagename);
		System.out.println(Testvariables01.pincode);
		System.out.println("********************************"); 
		System.out.println(t1.collno);
		System.out.println(t1.collagename);
		System.out.println(t1.pincode);

	}

}

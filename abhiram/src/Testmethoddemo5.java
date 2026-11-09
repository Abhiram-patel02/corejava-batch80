import java.util.Scanner;
public class Testmethoddemo5 {
    static void stname (String a,String b) {
    	System.out.println("your full name ="+a+b);
    }
    static void age(int c) {
    	System.out.println("enter age is="+c);
    }
    static void collagename(String q) {
    	System.out.println("your collage name="+q);
    	
    }
     void subjects(String w,String e,String r) {
    	 System.out.println("languages u know="+w+","+e+","+r);
    	 
     }
      void location(String m) {
    	  System.out.println("your location is ="+m);
      }
       static void rollnum(int r) {
    	System.out.println("enter roll number is ="+r);   
       }
     public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
       System.out.println("enter your first name");
       String fname = sc.nextLine();
       System.out.println("enter your secound name");
       String sname =sc.nextLine();
       stname(fname,sname);
       
       System.out.println("enter your age");
       int age = sc.nextInt();
       age(age);
      sc.nextLine();//this command is compelsary to write string after int 
       
       System.out.println("enter your collage name");
       String clname = sc.nextLine();
       collagename(clname);
       
       Testmethoddemo5 s1 = new Testmethoddemo5();
       System.out.println("enter your location");
       String loc = sc.nextLine();
       s1.location(loc);
       
    	System.out.println("enter your first subject");
        String sub1 = sc.nextLine();
        System.out.println("enter your secound subject ");
        String sub2 = sc.nextLine();
        System.out.println("enter your third subject ");
        String sub3 = sc.nextLine();
        s1.subjects(sub1,sub2,sub3);
        
        System.out.println("enter your roll num");
        int rollnum = sc.nextInt();
        rollnum(rollnum);
        }

}

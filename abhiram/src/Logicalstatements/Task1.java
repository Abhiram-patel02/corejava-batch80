package Logicalstatements;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("check whether num is even or ode");
	  int evnorode = sc.nextInt();
      if (evnorode %2 ==0 ) {
    	  System.out.println(" its even");
      }
      else {
    	  System.out.println(" its ode");
      }
	}

}

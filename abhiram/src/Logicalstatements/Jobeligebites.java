package Logicalstatements;
import java.util.Scanner;
public class Jobeligebites {

	public static void main(String[] args) {
		System.out.println("lets check your eligibility");
		System.out.println("are u coming to class regularly...?");
		Scanner sc = new Scanner(System.in);
		boolean elgty= sc.nextBoolean();
		boolean test = sc.nextBoolean();
		boolean mock = sc.nextBoolean();
		
      if (elgty && test && mock ) {
    	  System.out.println("are u eligiblile for this job ");
      }
            else {
    	  System.out.println("u are not eligibile for GUT");
      }
	}

}

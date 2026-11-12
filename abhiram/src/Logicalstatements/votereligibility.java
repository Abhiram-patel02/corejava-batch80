package Logicalstatements;
import java.util.Scanner;
public class votereligibility {

	public static void main(String[] args) {
		System.out.println("babu enter your age...?");
		Scanner sc = new Scanner(System.in);
		double vtelg = sc.nextDouble();
		if(vtelg>=18) {
            	System.out.println("coungrats you are eligible");
                System.out.println("now u can vote");
		}
             else {
			System.out.println("babu pakakivelli aduko ra");
                }
	}
	}



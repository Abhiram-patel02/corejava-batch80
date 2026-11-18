package Logicalstatements;
import java.util.Scanner;
public class Testdemo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a day");
		String day = sc.nextLine();
		
		switch(day) {
		case "mon":  
		System.out.println("monday is lazy day");
		break;
		case "tues","wed","thur":
		System.out.println("normaldays to work");
		break;
		case "fri":
		System.out.println("weekend mode");
		break;
		case "sat","sun":
		System.out.println("holiday and happy day");
		break;
		default :
		System.out.println("enter day is not avelable");
		}
	}
}


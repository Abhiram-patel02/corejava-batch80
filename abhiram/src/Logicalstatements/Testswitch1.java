//write a program to print days
package Logicalstatements;
import java.util.Scanner;

public class Testswitch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("enter a day");
       String day = sc.next();
       switch(day) {
       case "mon"->System.out.println("monday is lazy day");
       case "tues","wed","thur"-> System.out.println("week mode started");
       case "fri"->System.out.println("chill at office");
       case "sat","sun"->System.out.println("holiday");
       default->System.out.println("entr dAY is not avaliable");
       }
	}

}

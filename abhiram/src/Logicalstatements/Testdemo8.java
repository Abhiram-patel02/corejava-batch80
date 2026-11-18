package Logicalstatements;
import java.util.Scanner;
public class Testdemo8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		System.out.println("enter b number");
		int b = sc.nextInt();
		
		int result= 0;
		System.out.println("enter a symbol to procid like + - * % ");
		String sym = sc.next();
		
		switch (sym) {
		case "+" :
			result = a + b;
			break;
		case "-" :
			result = a-b;
			break;
		case"*" :
			result = a*b;
			break;
		case "%" :
		   result = a%b;
		   break;
		   
		   default :
			    System.out.println("invalid statements");
			   break;
			
		}
		System.out.println("result = "+result);

	}

}

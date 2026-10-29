package com.abhiram;

import java.math. BigInteger ;
import java.math.BigDecimal ;





public class datatypestestdemo2 {
	
	String s = "java is simple";
	String s1 = new String ("abhiram");
	BigInteger bi;
	BigInteger bi2 = new BigInteger("256283532783739038303693");

	BigDecimal bd ;
	BigDecimal bd2 = new BigDecimal("638936816846846946.09749749649649748");

	Integer i = 100;
	int i1 = i;
	Character c = 'a';
	Boolean boo ;
	//Dog d ;
    
	public static void main(String[] args) {
		datatypestestdemo2 d2 = new datatypestestdemo2();
		System.out.println("string = "+d2.s);
		System.out.println("string = "+d2.s1);
		System.out.println("big intger = "+d2.bi);
		System.out.println("big intger = "+d2.bi2);
		System.out.println("big decimal = "+d2.bd);
		System.out.println("big decimal = "+d2.bd2);
		System.out.println("intger= "+d2.i1);
		System.out.println("intger= "+d2.i);
        System.out.println("character = "+d2.c);
		System.out.println("boolen = "+d2.boo);
	}

}

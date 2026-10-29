package com.abhiram;

public class Cricketer {
	
	static String bordname = "Bcc";
	static String countryname;
    
	String cricketername;
	int jerseyno;
	int highestscore;
	
	
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println(bordname);
		System.out.println(countryname="india");
		
		Cricketer abhi=new Cricketer();
		abhi.cricketername="Abiram";
		abhi.jerseyno=1;
		abhi.highestscore=100;
		
		System.out.println(abhi.cricketername);
		System.out.println(abhi.jerseyno);
		System.out.println(abhi.highestscore);
	
		Cricketer suresh=new Cricketer();
		suresh.cricketername="suresh";
		suresh.jerseyno=2;
		suresh.highestscore=90;
		
	    System.out.println(suresh.cricketername);
		System.out.println(suresh.jerseyno);
		System.out.println(suresh.highestscore);
		
		
		Cricketer ramesh=new Cricketer();
		ramesh.cricketername="ramesh";
		ramesh.jerseyno=3;
		ramesh.highestscore=99;
		
		System.out.println(ramesh.cricketername);
		System.out.println(ramesh.jerseyno);
		System.out.println(ramesh.highestscore);
		
		Cricketer saikrishna=new Cricketer();
		saikrishna.cricketername="saikrishna";
		saikrishna.jerseyno=4;
		saikrishna.highestscore=78;
		
		 String bordname = "ipl";
		 String countryname = "bharat";
	    
		
		System.out.println(saikrishna.cricketername);
		System.out.println(saikrishna.jerseyno);
		System.out.println(saikrishna.highestscore);
		System.out.println(bordname);
		System.out.println(countryname);
		
		System.out.println("main method ended");

	}

}

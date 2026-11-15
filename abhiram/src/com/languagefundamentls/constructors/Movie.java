package com.languagefundamentls.constructors;
 
public class Movie {
	String director;
	String hero;
	String heroin;
	String budget;
	String name;

	public static void main(String[] args) {
		System.out.println("main method started");
	
        Movie m=new Movie();
        m.movieInfo();
	}
	void movieInfo() {
		System.out.println("director of the movie :"+director);
		System.out.println("hero of movie :"+hero);
		System.out.println("heroine of the movie :"+heroin);
		System.out.println("budget of the budget :"+budget);
		System.out.println("name of the movie :"+name);
	}

}

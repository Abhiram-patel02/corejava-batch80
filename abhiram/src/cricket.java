
public class cricket {
	
	// declaration topic
  //wap to print indian cricker team info
	
	static String countryname;
	static int countryid;
	
	int jerseyno;
	String cricketorname;
	
	public static void main(String[] args) {
		System.out.println("welcome to indian cricket team");
		//decleration by developer
			countryname = "India";
		countryid = 81;
		
		cricket s1 = new cricket();
		cricket s2 = new cricket();
		
		s1.jerseyno = 567;
		 s1.cricketorname = "abhiram";
		 s2.jerseyno =765;
		 s2.cricketorname ="suresh";
		 
		 System.out.println( "country name : "+countryname);
			System.out.println( "country id :"+countryid);
			countryname = "bharat";
			countryid = 76;
			
         System.out.println( "1st cricketor :"+s1.jerseyno);
         System.out.println("1st cricketor :"+s1.cricketorname);
         
         System.out.println("countryname :"+countryname);
			System.out.println("countryid :"+countryid);
			
         System.out.println("2nd cricketor :"+s2.jerseyno);
         System.out.println("2nd cricketor :"+s2.cricketorname);
	}

}

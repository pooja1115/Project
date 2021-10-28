import java.util.Scanner;

class PassengerName
	{
		int fare;
	String name,destination,source;
	int SeatNo;
	
  void Passenger_Detail()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : "); 
		name = sc.next();
		System.out.print("Enter destination : "); 
		destination = sc.next();
		System.out.print("Enter source : "); 
		source = sc.next();
		System.out.print("Enter Fare : "); 
		fare = sc.nextInt();
		
		System.out.print("Enter your seat no : "); 
		SeatNo = sc.nextInt();
		
		
		
		
	}
    
    void get_Passenger_Detail() 
	    { 
	     System.out.println(SeatNo+"  \t"       +name +  "  \t"+ source +  "  \t"+destination +  "  \t"+fare+  "  \t"); 
	    } 
}
	
	class worker
{
	int mobNo;
	String Dname;
	void Worker_detail() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : "); 
		Dname = sc.next();
		System.out.print("Enter mobile no : "); 
		mobNo = sc.nextInt();
		}
		void get_worker_Detail() 
	    { 
	     System.out.println(Dname+  "  \t"+ mobNo+  "  \t"); 
	    } 
	}
	

	public class ShivShahiBus
		{	 
		public static void main(String[] args) {
			int j,count1=2,count2=2,count3=2;
			int i;
			PassengerName p[] = new PassengerName[100];
	        for (i = 0; i < 25; i++)
	           p[i]=new PassengerName();

	        worker w[] = new worker[100];
	        for (i = 0; i < 100; i++)
	            w[i] = new worker();
	 
	      	p[0].SeatNo=1;
	    	p[0].name="nikita";
	    	p[0].source="pune";

	    	p[0].destination="nashik";
	    	p[1].SeatNo=2;
	    	p[1].name="pooja";
	    	p[1].source="nashik";

	    	p[1].destination="pune";
	    	
	    	w[0].Dname="Raju";
	    	w[0].mobNo=6654666;
	    	
	    	
	    	w[1].Dname="ram";
	    	w[1].mobNo=66546656;
	    	
	    	
	    	
	    		
	    		int ch,S=1,S1,S2,S3,S4,S5;
	    		Scanner sc=new Scanner(System.in);
	            
	    		while(S==1)
	    		{
	    		
	    	        System.out.println("********************************************");
	    		System.out.println("**    WELCOME TO SHIVSHAHI BUS                     **");
	    		System.out.println("********************************************");
	    		System.out.println("** [1]    DESTINATION                   **");
	    		System.out.println("** [2]    PASSENGER                     **");
	    		System.out.println("** [3]    WOKER DETAILS                  **");
	    		System.out.println("** [4]    SEAT DETAILS                  **");
	    		System.out.println("***************************************");
	    		System.out.println("***************************************\n");
	    		
	    		System.out.println("Enter your choise");
	    		ch=sc.nextInt();
	    		switch(ch)
	                {
	    		
	    		
	                case 1:
	            	{
	            		System.out.println("***************************************");
	            		System.out.println("**   DESTINATION             |  FARE |**");
	            		System.out.println("*****************************************");
	            		System.out.println("** 1.)MUMBAI TO NASHIK       | RS600 |   **");
	            		System.out.println("** 3.)NASHIK TO KALYAN       | RS150 |     **");
	            		System.out.println("** 4.)NASHIK TO DADAR        | RS200 |      **");
	            		System.out.println("** 5.)MUMBAI TO NASHIK       | RS250 |      **");
	            		System.out.println("***************************************");
	            		S2=1;
	            			
	            		}
	            	 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
	                 S2 = sc.nextInt();

	            		break;
	    		case 2:
	    		{
	    		System.out.println("................................................................");
	    		System.out.println("                    **pessenger details **               ");
	    		System.out.println("................................................................");	
	    			S1=1;
	    			while(S1==1)
	    			{
	    			System.out.println("1.Add your name");
	    		       System.out.println("2.Existing passenger  list");
	    		        System.out.println("enter ur choise");
	    			int ch1=sc.nextInt();
	    			
	    			switch(ch1)
	    			{
	    			case 1:
	    			{
	    				p[count1].Passenger_Detail();
	    				count1++;
	    				 System.out.println(  "Seat number \t name\t  source\t  destination\t  fare\t  "); 
	    				   for (j = 0; j < count1; j++)
	    	               {
	    	                   p[j].get_Passenger_Detail();
	    	               }
	    				break;
	    			}
	    			case 2:
	    			{
	    				System.out.println(".......................................................................");
	    				 System.out.println(  "Seat number \t name\t  source\t  destination\t  fare\t  "); 
	    			   for (j = 0; j < count1; j++)
	                   {
	                       p[j].get_Passenger_Detail();
	                   }
	    			   break;
	    			}
	    			}
	    			 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
	                 S1 = sc.nextInt();
	    			}
	    			break;
	    		}
	
	
	case 3:
	{
		System.out.println("................................................................");
	     System.out.println("                    **WORKER DETAILS **               ");
	    System.out.println("................................................................");	
		S2=1;
		while(S2==1)
		{
		System.out.println("1.Add your name");
	System.out.println("2.Existing worker  list");
	System.out.println("enter ur choise");
		int ch1=sc.nextInt();
		
		switch(ch1)
		{
		case 1:
		{
			w[count2].Worker_detail();
			count2++;
			System.out.println(".......................................................................");
			 System.out.println("name     \t mobile number\t     " );
		   for (j = 0; j < count2; j++)
           {
                 w[j].get_worker_Detail();
           }
			break;
		}
		case 2:
		{
			System.out.println(".......................................................................");
			 System.out.println("name     \t mobile number\t     " );
		   for (j = 0; j < count2; j++)
           {
                 w[j].get_worker_Detail();
           }
		   break;
		}
		}
		
		 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
      S2 = sc.nextInt();
		}
		break;
	}
	
 
			 
	
	
}
	}
	}}


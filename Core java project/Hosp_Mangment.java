package com.Hospital;


//Project of Hospital Management System

import java.util.*;

	class Doctor
	{
		int Id,Rno;
		 String name,spe,qualf,time;
		
  void New_Doctors_info()
  {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter id:");
	Id=sc.nextInt();
	System.out.print("Enter Name:");
	name=sc.next();
	System.out.print("Enter Specialization:");
	spe=sc.next();
	System.out.print("Enter Timing:");
	time=sc.next();
	System.out.print("Enter Qualification:");
	qualf=sc.next();
	System.out.print("Enter Roomno:");
	Rno=sc.nextInt();
  }
  
  void get_doctor_info()
  {
  	System.out.println(Id + "\t" + name + "  \t" + spe + "     \t" + time + "    \t" + qualf + "       \t" + Rno);
  }
	}
	
	class Patient
	{
		int PId,PRno,PAge;
		 String Pname,PGender,PDis;
		
  void New_Patient_info()
  {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter id:");
	PId=sc.nextInt();
	System.out.print("Enter Name:");
	Pname=sc.next();
	System.out.print("Enter Age:");
	PAge=sc.nextInt();
	System.out.print("Enter Gender:");
	PGender=sc.next();
	System.out.print("Enter Disease:");
	PDis=sc.next();
	System.out.print("Enter Roomno:");
	PRno=sc.nextInt();
  }
  
  void get_Patient_info()
  {
  	System.out.println(PId + "\t" + Pname + "  \t" +PAge + "     \t" + PGender + "    \t" + PDis + "  \t" + PRno);
  }
	}
	
	class Lab
	{
		int cost;
		 String facility ;
		
  void New_Lab_info()
  {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Facility");
	facility= sc.next();
	System.out.print("Enter Cost:");
	cost=sc.nextInt();
  }
  
  void Show_Lab_info()
  {
  	System.out.println(facility + "\t" + cost);
  }
	}
	
	class Facility
	{
		 String fac_Name ;
		
  void New_Facility()
  {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Facility");
	fac_Name= sc.next();
	}
  
  void Show_Facility()
  {
  	System.out.println( fac_Name);
  }
	}
	
	class Staff
	{
		int sId,sAge;
		 String sname,sGender,stime;
		
  void New_staff_info()
  {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter id:");
	sId=sc.nextInt();
	System.out.print("Enter Name:");
	sname=sc.next();
	System.out.print("Enter Age:");
	sAge=sc.nextInt();
	System.out.print("Enter Gender:");
	sGender=sc.next();
	System.out.print("Enter time:");
	stime=sc.next();
  }
  
  void get_staff_info()
  {
  	System.out.println(sId + "\t" + sname + "   \t" +sAge + "   \t" + sGender + "  \t" + stime);
  }
	}
	
	public class Hosp_Mangment
	{	 
	public static void main(String[] args) {
		int j,count1=2,count2=2,count3=2,count4=2,count5=2;
		int i;
		Doctor[] d = new Doctor[25];
      for (i = 0; i < 25; i++)
          d[i] = new Doctor();
      
      Patient[] p=new Patient[100];
      for (i = 0; i < 100; i++)
          p[i] = new Patient();
      
     Lab[] l=new Lab[100];
      for (i = 0; i < 100; i++)
          l[i] = new Lab();
      
     Facility[] f=new Facility[100];
      for (i = 0; i < 100; i++)
          f[i] = new Facility();
      
     Staff[] s=new  Staff[100];
      for (i = 0; i < 100; i++)
          s[i] = new Staff();
      
		d[0].Id = 1;
		d[0].name = "Dr.Deshmukh";
		d[0].spe="ENT";
		d[0].time= "10 am to 4 pm";
		d[0].qualf = "MBBS";
		d[0].Rno= 10;
		
		d[1].Id = 2;
		d[1].name = "Dr.Joshi";
		d[1].spe="Physician";
		d[1].time= "10 am to 3 pm";
		d[1].qualf = "MBBS,MD";
		d[1].Rno= 05;
		
		p[0].PId = 01;
		p[0].Pname = "PQR";
		p[0].PAge=40;
		p[0].PGender= "Male";
		p[0].PDis="TB";	
		p[0].PRno= 01;
		
		p[1].PId = 01;
		p[1].Pname = "ABC";
		p[1].PAge=35;
		p[1].PGender= "Female";
		p[1].PDis="Cancer";	
		p[1].PRno= 03;
		
		l[0].facility="x-ray";
		l[0].cost=400;
		
		l[1].facility="CT scan";
		l[1].cost=1000;
		
		f[0].fac_Name="Ambulance";
		f[1].fac_Name="Admit Facility";
		
		s[0].sId = 101;
		s[0].sname = "Raj";
		s[0].sAge=27;
		s[0].sGender= "Male";
		s[0].stime="9pm to 6am";	
		
		s[1].sId = 102;
		s[1].sname = "Amisha";
		s[1].sAge=25;
		s[1].sGender= "Female";
		s[1].stime="10am to 5pm";
		
		int ch,S=1,S1,S2,S3,S4,S5;
		Scanner sc=new Scanner(System.in);
      
		while(S==1)
		{
		System.out.println("--------------------------*WELCOME*-----------------------------");
		System.out.println("-------------------------<<<MENU>>>-----------------------------");
		System.out.println("                                                    ");
		System.out.println("1.Doctos  2. Patients  3.Laboratories  4. Facilities  5. Staff ");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Enter your choise");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println("................................................................");
			System.out.println("                    **DOCTOR SECTION**               ");
			System.out.println("................................................................");	
			S1=1;
			while(S1==1)
			{
			System.out.println("1.Add New Entry");
			System.out.println("2.Existing Doctor list");
			System.out.println("enter ur choise");
			int ch1=sc.nextInt();
			
			switch(ch1)
			{
			case 1:
			{
				d[count1].New_Doctors_info();
				count1++;
				System.out.println("Id  \t  Name  \t  Specialist  \t  Timing  \t  Qualification  \t  RoomNo");
				   for (j = 0; j < count1; j++)
	               {
	                   d[j].get_doctor_info();
	               }
				break;
			}
			case 2:
			{
				System.out.println(".......................................................................");
			   System.out.println("Id  \t  Name  \t  Specialist  \t  Timing  \t  Qualification  \t  RoomNo");
			   for (j = 0; j < count1; j++)
             {
                 d[j].get_doctor_info();
             }
			   break;
			}
			}
			 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
           S1 = sc.nextInt();
			}
			break;
		}
		case 2:
		{
			System.out.println("................................................................");
			System.out.println("                    **PATIENT SECTION**               ");
			System.out.println("................................................................");	
			S2=1;
			while(S2==1)
			{
			System.out.println("1.Add New Entry");
			System.out.println("2.Existing Patient list");
			System.out.println("enter ur choise");
			int ch1=sc.nextInt();
			
			switch(ch1)
			{
			case 1:
			{
				p[count2].New_Patient_info();
				count2++;
				System.out.println(".......................................................................");
				System.out.println("Id \t Name \t Age \t Gender \t Disease \t  RoomNo");
			   for (j = 0; j < count2; j++)
	           {
	               p[j].get_Patient_info();
	           }
				break;
			}
			case 2:
			{
				System.out.println(".......................................................................");
				System.out.println("Id \t Name \t Age \t Gender \t Disease \t  RoomNo");
			   for (j = 0; j < count2; j++)
	           {
	               p[j].get_Patient_info();
	           }
			   break;
			}
			}
			 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
	         S2 = sc.nextInt();
			}
		break;	
		}
		
		case 3:
		{
			System.out.println("................................................................");
			System.out.println("                    **LAB SECTION**               ");
			System.out.println("................................................................");	
			S3=1;
			while(S3==1)
			{
			System.out.println("1.Add New Entry");
			System.out.println("2.Existing Laboratories list");
			System.out.println("enter ur choise");
			int ch1=sc.nextInt();
			
			switch(ch1)
			{
			case 1:
			{
				l[count3].New_Lab_info();
				count3++;
				System.out.println(".......................................................................");
				System.out.println("facility \t cost");
			   for (j = 0; j < count3; j++)
	           {
	               l[j].Show_Lab_info();
	           }
				break;
			}
			case 2:
			{
				System.out.println(".......................................................................");
				System.out.println("facility \t cost");
			   for (j = 0; j < count3; j++)
	           {
	               l[j].Show_Lab_info();
	           }
			   break;
			}
			}
			 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
	         S3 = sc.nextInt();
			}
		break;	
		}
		
		case 4:
		{
			System.out.println("................................................................");
			System.out.println("                    **FACILITY SECTION**               ");
			System.out.println("................................................................");	
			S4=1;
			while(S4==1)
			{
			System.out.println("1.Add New Entry");
			System.out.println("2.Existing facility list");
			System.out.println("enter ur choise");
			int ch1=sc.nextInt();
			
			switch(ch1)
			{
			case 1:
			{
				f[count4].New_Facility();
				count4++;
				System.out.println(".......................................................................");
				System.out.println("fac_name");
			   for (j = 0; j < count4; j++)
	           {
	               f[j].Show_Facility();
	           }
				break;
			}
			case 2:
			{
				System.out.println(".......................................................................");
				System.out.println("fac_name");
			   for (j = 0; j < count4; j++)
	           {
	               f[j].Show_Facility();
	           }
			   break;
			}
			}
			 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
	         S4 = sc.nextInt();
			}
		break;	
		}
		
		case 5:
		{
			System.out.println("................................................................");
			System.out.println("                    **STAFF SECTION**               ");
			System.out.println("................................................................");	
			S5=1;
			while(S5==1)
			{
			System.out.println("1.Add New Entry");
			System.out.println("2.Existing Staff list");
			System.out.println("enter ur choise");
			int ch1=sc.nextInt();
			
			switch(ch1)
			{
			case 1:
			{
				s[count5].New_staff_info();
				count5++;
				System.out.println(".......................................................................");
				System.out.println("sId \t sName \t sAge \t sGender \t stime");
			   for (j = 0; j < count5; j++)
	           {
	               s[j].get_staff_info();
	           }
				break;
			}
			case 2:
			{
				System.out.println(".......................................................................");
				System.out.println("sId \t sName \t sAge \t sGender \t stime");
			   for (j = 0; j < count5; j++)
	           {
	               s[j].get_staff_info();
	           }
			   break;
			}
			}
			 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
	         S5 = sc.nextInt();
			}
		break;	
		}
		  default:
        {
            System.out.println(" You Have Enter Wrong Choice!!");
        }
}
System.out.println("\nReturn to MAIN MENU Press 1");
S = sc.nextInt();
}
}
	
}

	
/*	
OUTPUT
1.FOR DOCTOR:
--------------------------*WELCOME*-----------------------------
-------------------------<<<MENU>>>-----------------------------
                                                  
1.Doctos  2. Patients  3.Laboratories  4. Facilities  5. Staff 
----------------------------------------------------------------
Enter your choise
1
................................................................
                  **DOCTOR SECTION**               
................................................................
1.Add New Entry
2.Existing Doctor list
enter ur choise
2
.......................................................................
Id  	  Name  	  Specialist  	  Timing  	  Qualification  	  RoomNo
1	Dr.Deshmukh  	ENT     	10 am to 4 pm    	MBBS       	10
2	Dr.Joshi  	Physician     	10 am to 3 pm    	MBBS,MD       	5

Return to Back Press 1 and for Main Menu Press 0
1
1.Add New Entry
2.Existing Doctor list
enter ur choise
1
Enter id:05
Enter Name:Dr.Gaikwad
Enter Specialization:Dentist
Enter Timing:12to4pm
Enter Qualification:BDS
Enter Roomno:05
Id  	  Name  	  Specialist  	  Timing  	  Qualification  	  RoomNo
1	Dr.Deshmukh  	ENT     	10 am to 4 pm    	MBBS       	10
2	Dr.Joshi  	Physician     	10 am to 3 pm    	MBBS,MD       	5
5	Dr.Gaikwad  	Dentist     	12to4pm    	BDS       	5

Return to Back Press 1 and for Main Menu Press 0

2.FOR PATIENT:
Return to MAIN MENU Press 1
1
--------------------------*WELCOME*-----------------------------
-------------------------<<<MENU>>>-----------------------------
                                                  
1.Doctos  2. Patients  3.Laboratories  4. Facilities  5. Staff 
----------------------------------------------------------------
Enter your choise
2
................................................................
                  **PATIENT SECTION**               
................................................................
1.Add New Entry
2.Existing Patient list
enter ur choise
2
.......................................................................
Id 	 Name 	 Age 	 Gender 	 Disease 	  RoomNo
1	PQR  	40     	Male    	TB  	1
1	ABC  	35     	Female    	Cancer  	3

Return to Back Press 1 and for Main Menu Press 0
1
1.Add New Entry
2.Existing Patient list
enter ur choise
1
Enter id:19
Enter Name:ASD
Enter Age:65
Enter Gender:male
Enter Disease:fever
Enter Roomno:1
.......................................................................
Id 	 Name 	 Age 	 Gender 	 Disease 	  RoomNo
1	PQR  	40     	Male    	TB  	1
1	ABC  	35     	Female    	Cancer  	3
19	ASD  	65     	male    	fever  	1

Return to Back Press 1 and for Main Menu Press 0

3.LAB:
--------------------------*WELCOME*-----------------------------
-------------------------<<<MENU>>>-----------------------------
                                                  
1.Doctos  2. Patients  3.Laboratories  4. Facilities  5. Staff 
----------------------------------------------------------------
Enter your choise
3
................................................................
                  **LAB SECTION**               
................................................................
1.Add New Entry
2.Existing Laboratories list
enter ur choise
2
.......................................................................
facility 	 cost
x-ray	400
CT scan	1000

Return to Back Press 1 and for Main Menu Press 0
1
1.Add New Entry
2.Existing Laboratories list
enter ur choise
1
Enter FacilityBloodBank
Enter Cost:1200
.......................................................................
facility 	 cost
x-ray	400
CT scan	1000
BloodBank	1200

4.FACILITY:
--------------------------*WELCOME*-----------------------------
-------------------------<<<MENU>>>-----------------------------
                                                  
1.Doctos  2. Patients  3.Laboratories  4. Facilities  5. Staff 
----------------------------------------------------------------
Enter your choise
4
................................................................
                  **FACILITY SECTION**               
................................................................
1.Add New Entry
2.Existing facility list
enter ur choise
2
.......................................................................
fac_name
Ambulance
Admit Facility

Return to Back Press 1 and for Main Menu Press 0
1
1.Add New Entry
2.Existing facility list
enter ur choise
1
Enter FacilityCanteen
.......................................................................
fac_name
Ambulance
Admit Facility
Canteen

5.STAFF:
--------------------------*WELCOME*-----------------------------
-------------------------<<<MENU>>>-----------------------------
                                                  
1.Doctos  2. Patients  3.Laboratories  4. Facilities  5. Staff 
----------------------------------------------------------------
Enter your choise
5
................................................................
                  **STAFF SECTION**               
................................................................
1.Add New Entry
2.Existing Staff list
enter ur choise
2
.......................................................................
sId 	 sName 	 sAge 	 sGender 	 stime
101	Raj  	27     	Male    	9pm to 6am
102	Amisha  	25     	Female    	10am to 5pm

Return to Back Press 1 and for Main Menu Press 0
1
1.Add New Entry
2.Existing Staff list
enter ur choise
1
Enter id:103
Enter Name:jay
Enter Age:30
Enter Gender:male
Enter time:10to5pm
.......................................................................
sId 	 sName 	 sAge 	 sGender 	 stime
101  	Raj  	 27     Male    	9pm to 6am
102 	Amisha  25     	Female    	10am to 5pm
103 	jay  	30     	male    	10to5pm

Return to Back Press 1 and for Main Menu Press 0
0

Return to MAIN MENU Press 1
1
--------------------------*WELCOME*-----------------------------
-------------------------<<<MENU>>>-----------------------------
                                                  
1.Doctos  2. Patients  3.Laboratories  4. Facilities  5. Staff 
----------------------------------------------------------------
Enter your choise
6
You Have Enter Wrong Choice!!

Return to MAIN MENU Press 1
*/
	
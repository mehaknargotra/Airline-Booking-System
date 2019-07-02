//package Frankfin;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
	
	static	Registration o=new Registration();
	static	FrankfinDB od=new FrankfinDB();
	static	BookingDB ob=new BookingDB();
	static	Booking k=new Booking();
	static FrankfinSystem f=new FrankfinSystem();
	Scanner sc=new Scanner(System.in);

	public  void display() {
		

		System.out.println("########################################WELCOME TO FRANKLIN AIRLINES!########################################");
		o.aero();
		System.out.println("\n\n\n========================================================MENU=====================================================");
		System.out.println("\t\t\t\t\t\t 1.Display Flights \n\n\n\t\t\t\t\t\t 2.Book Flight \n\n\n\t\t\t\t\t\t 3.Cancel Flight \n\n\n\t\t\t\t\t\t 4.Display Booking \n\n\n\t\t\t\t\t\t 5.Airline server\n\n\n\t\t\t\t\t\t 6.Exit \n\n\n");
		
	}
	
	
	public void aero()
	{

		
			
		System.out.println("\t\t\t\t                ___");
		System.out.println("\t\t\t\t                \\ \' ");
	    System.out.println("\t\t\t\t                 \\ \' ");
	System.out.println("\t\t\t\t ___                  \\ \' ");              
	System.out.println("\t\t\t\t|    \\              \\   \' ");
	System.out.println("\t\t\t\t|_____\\              \\   \' ");
	System.out.println("\t\t\t\t|______\\              \\   \' ");
	System.out.println("\t\t\t\t|       \\              \\   \' ");
	System.out.println("\t\t\t\t|      __\\__---------------------------------._. ");
	System.out.println("\t\t\t\t__|---~~~__o_o_o_o_o_o_o_o_o_o_o_o_o_o_o_o_o_o_[][\'__");
	System.out.println("\t\t\t\t|___                         /~      )                \'__");
	System.out.println("\t\t\t\t~~~---..._______________/      ,/_____________________/");
	System.out.println("\t\t\t\t                       /       /");
	System.out.println("\t\t\t\t                      /     ,/");
	System.out.println("\t\t\t\t                     /     /");
	System.out.println("\t\t\t\t                    /    ,/");
	System.out.println("\t\t\t\t                   /    /");
	System.out.println("\t\t\t\t                  //  ,/");
	System.out.println("\t\t\t\t                 //  /");
	System.out.println("\t\t\t\t                // ,/");
	 System.out.println("\t\t\t\t              //_/");
			
			
		
		
	}
	

	
	
	
	public void working(int ch) throws SQLException, ClassNotFoundException {
		//String c="y";
		//o.display();
		switch(ch) {
		case 1:			
						od.selectAll();
						//System.out.println(a);
						//airline db
						break;
		case 2: 	//if(b==3)
					
						System.out.println("In Booking");
						k.finalize();
						//book();
						break;
		case 3:
						System.out.println("Please enter your Booking Id:");
						int bid=sc.nextInt();
						BookingDB.delete(bid);
						//k.cancel(bid);
						// cancel();
						break;
		case 4: 		
						//System.out.println("Please enter your Booking Id:");
						//int bid1=sc.nextInt();
						BookingDB.select();
						//Bookingdatabase obd=new Bookingdatabase();
						//obd.select();
						// displaybooking();
						break;
		case 5:    
						f.ports();
						break;
		case 6: 		System.exit(0);
		
		default:		System.out.println("Please enter valid choice");
		
		}
		//System.out.println("do u wish to continue(y/n)");
		//c=sc.next();
	}
public static void main(String args[]) throws SQLException, ClassNotFoundException {
	String c="y";

	Scanner sc=new Scanner(System.in);
	o.display();
	
	//do {
		int ch=sc.nextInt();
		o.working(ch);
//	}while(c=="y");
	
	
	
	
	
	
}
}


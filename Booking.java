//package Frankfin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Booking {
	
	Type amount;	
	Login log;
	String nm,src,dest;
	int n;
	static Connection Myconnect() throws SQLException
	 {
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","varsha","mysql" );
		 System.out.println("Connection established");
		return con;
		 
	  }
	
	

	public void entry() throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*********Enter Your Details**********");
		System.out.println("Enter Your Name");
		String nm=sc.next();
		
		System.out.println("Enter Your Password");
		String pass=sc.next();
		
		System.out.println("Enter Your Source");
		String src=sc.next();
		
		System.out.println("Enter Your Destination");
		String dest=sc.next();
		
		log=new Login(nm,pass);
		String p=log.getPswrd(nm);
		payment(nm,src,dest,p);
	 }
	

	
	public int radnumber()
	{
		Random r=new Random();
		int n = r.nextInt(50);
		n += 1;
		//System.out.println(n);
		return n;
	}
	
	public void receipt(int n,String nm,String src,String dest,int amount,String p,String type) throws SQLException{
		
		ArrayList<Object> list=new ArrayList<Object>();//Creating arraylist    
	      list.add(n);//Adding object in arraylist    
	      list.add(nm);    
	      list.add(src);    
	      list.add(dest);
	      list.add(amount);
	      System.out.println(list);
	      BookingDB db=new BookingDB();
	      db.insert(n, nm, p, type, src, dest, n*31);
		
	}
	
	public int check() throws SQLException
	{
		java.sql.Statement st;
		Connection conn=Myconnect();
		String query="select source,dest from Flight ";
		PreparedStatement pst=conn.prepareStatement(query);
    
		 ResultSet rs=pst.executeQuery(query);
		 System.out.println("enter src and dest");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Your Source");
			String src1=sc.next();
			
			System.out.println("Enter Your Destination");
			String dest1=sc.next();
			
		 while(rs.next())
		 {
			 String s1=(String)rs.getString(1);
			 String s2=(String)rs.getString(2);
			 if(src1.equals(s1)&&  dest1.equals(s2))         //changes
					
			    return 1;
		 }
		//if(src.equals(airline.src)&&(dest.equals(airline.dest)))
		return 0;
		
	}
	
	public void payment(String nm,String src,String dest,String p) throws SQLException
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("**********Do You Want To do Payment('Y' for Yes/'N' for No)********");
		String ch=sc.next();
		
		switch(ch)
		{
		    case "Y"://display detail
		    	       int k=radnumber();
		    	       //Type t = new Type();
		    	       //t. getAmount();
		    	     // System.out.println(amount.getAmount());
		    	       amount = new Type();
		    	       System.out.println("Sucessful Booking Of Ticket"+""+amount.getAmount());
		    	       receipt(k,nm,src,dest,amount.getAmount(), p,amount.getCls());
		    	       break;
		    	
		    case "N":System.out.println("UnSucessful Booking");
		    
		}
	}
	
	public void finalize() throws SQLException
	{
		int k1=check();
	if(k1==1)
	{
	   entry();
	   //payment();

	}
	
	
	
	}	
	
	public void cancel(int rn) throws SQLException
	{
		
	if (rn==n)
	{
		BookingDB.delete(rn);
		System.out.println("Account deleted");
	}
	else {
			System.out.println("Not valid input!");
	}
	}	
	/*public static void main(String args[])
	{
		Booking b=new Booking();
		b.Finalize();
	}*/
	
}

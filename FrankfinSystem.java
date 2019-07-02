//package Frankfin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class FrankfinSystem {

	public int fno;
	public void insert() throws ClassNotFoundException, SQLException {
	}
	
	
	public  void ports() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Port Number:");
		i=s.nextInt();
		if(i==1)
		{
			 Port1 o1=new Port1();
				o1.insert();
		}
		else if(i==2)
		{
			Port2 o2=new Port2();
			o2.insert();
		}
		else if(i==3)
		{
			Port3 o3=new Port3();
			o3.insert();
		}
	}

}

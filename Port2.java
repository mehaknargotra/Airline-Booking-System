//package Frankfin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Port2 extends FrankfinSystem {
	public int pt;
	public String s,d,t;
	
	static Connection myConn() throws SQLException, ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","varsha","mysql");
		return c;
	}
    public void insert() throws ClassNotFoundException, SQLException
    {
    	Connection conn=myConn();
    	String sql = "insert into Flight " + " (flgtno,source,dest,time)" + " values (?, ?, ?, ?)";

	       PreparedStatement pst = conn.prepareStatement(sql);
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter flight details");
	       System.out.println("Enter Flight number");
	       fno=sc.nextInt();
	       System.out.println("Enter Source:");
	       s=sc.next();
	       System.out.println("Enter Destination:");
	       d=sc.next();
	       System.out.println("Enter Time:");
	       t=sc.next();
	       
	   	   pst.setInt(1, fno);
	   	   pst.setString(2, s);
	   	   pst.setString(3, d);
	   	   pst.setString(4, t);

	   	   int r=pst.executeUpdate();
	   	   System.out.println(r);
    }
}


//package Frankfin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FrankfinDB {

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
		static  void selectAll() throws SQLException {
			 java.sql.Statement st;
				Connection conn=Myconnect();
				String query="select * from Flight";
				PreparedStatement pst=conn.prepareStatement(query);
	         int i=1;
				 ResultSet rs=pst.executeQuery(query);
				 while(rs.next())
				 {
					 //System.out.println("Flight no-"+rs.getInt(1)+" "+"source-"+rs.getString(2)+" "+"dest-"
				 //+rs.getString(3)+" "+"time-"+rs.getString(4));
				 
					 System.out.println(i+"] \t FLIGHT NO:-"+rs.getInt(1)+"\n \t SOURCE:- "+rs.getString(2)+"\n   \t DESTINATION:-"
							 +rs.getString(3)+"\n \t TIME:-"+rs.getString(4)+"\n\n\n");
								 i++;
							 
				 
				 
				 }
			 
		 }

	}



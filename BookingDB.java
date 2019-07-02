//package Frankfin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookingDB {

	
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
	 
	 static void select() throws SQLException {
		 java.sql.Statement st;
			Connection conn=Myconnect();
			String query="select id,name,type,source,dest,flgtno from booking";
			PreparedStatement pst=conn.prepareStatement(query);
			//pst.setInt(1,id);
			 ResultSet rs=pst.executeQuery(query);
			 while(rs.next())
			 {
				 System.out.println("id-"+rs.getInt(1)+" "+"name-"+rs.getString(2)+" "+"type-"+rs.getString(3)+"src"+rs.getString(4)+"dest"+rs.getString(5)+"fno"+rs.getInt(6));
			 }

		 
	 }
	 
	 static void insert(int id, String name,String pass,String type,String src,String dest, int fno) throws SQLException {
		 java.sql.Statement st;
			Connection conn=Myconnect();
			
			String query="insert into booking values(?,?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(query);
			pst.setInt(1,id);
			pst.setString(2,name);
			pst.setString(3,pass);
			pst.setString(4,type);
			pst.setString(5,src);
			pst.setString(6,dest);
			pst.setInt(7,fno);

			 int rs=pst.executeUpdate();
			 System.out.println("rows affected"+rs);

			


	 }
	 
	 
	 static void delete(int id) throws SQLException {
		 java.sql.Statement st;
			Connection conn=Myconnect();
			 st=  conn.createStatement();
			 String query="delete from booking where id=?";
			 PreparedStatement pst=conn.prepareStatement(query);
             pst.setInt(1,id);
			 int rs=pst.executeUpdate();
			 System.out.println("rows affected"+rs);
			 System.out.println("deleted sucessfully");
	 }
	 
	/*public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
// insert();
		select(1);
	//	delete();
	}*/

}

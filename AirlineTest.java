import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class AirlineTest {

	
	   @Test
	   public void test() {	
		   System.out.println("enter your username and password");
		   Scanner sc=new Scanner(System.in);
		   String s=sc.next();
		   String p=sc.next();
		   Login l=new Login(s, p);
		   System.out.println(s);
		   System.out.println("retype pass");
		   String p1=sc.next();
		   String p2=l.getPswrd(s);
		   
		   System.out.println("p1="+p1+" "+"p2="+p2);
		   if(p2.equals(p1))
		   {
		   System.out.println("Sucess");    
	      }
		   else
			   System.out.println("fail");
	   
	

}
}
//package Frankfin;

import java.util.Properties;

public class Login {

	String name,pswrd;
    Properties p=new Properties();  

	/*public Login(String name, String pswrd) {
		super();
	    p.setProperty(name,pswrd);  
		this.name = name;
		this.pswrd = pswrd;
	}*/

	public Login(String name, String pswrd) {
		// TODO Auto-generated constructor stub
	    
	    this.name = name;
		this.pswrd = pswrd;
		p.put(name,pswrd);  
		

	}

	public String getPswrd(String name) {
	    return p.getProperty(name);
	}
}

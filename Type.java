//package Frankfin;

import java.util.Scanner;

public class Type {

	int amount;
	String cls;
	
	public void setAmount(int amount) {
		this.amount = amount;
	}


	public int getAmount() {
		return amount;
	}

	public String getCls()
	{
		return cls;
	}
	
	public Type()
	{
	System.out.println("********Choose Type of Class('E' for Economy/'B' for Business)**********");
	Scanner sc=new Scanner(System.in);
	 cls=sc.next();
	
	switch(cls)
	{
		case "E": //amount=amount+5000;
				  setAmount(5000);
				  System.out.println("Economy class amount is:"+amount);
				  getAmount();
				  break;
				  
				  
	    case "B"://amount=amount+10000;
	    		 System.out.println("Business 	class amount is:"+amount);
	    		 setAmount(10000);
	    		 getAmount();
	    		 break;
		  		
	 }
	
	}

}
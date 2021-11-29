package com.greatlearning.corejava;

class Customer
{
 	//private String fname = "Dev";
	
	public String lastname = "Patel";
 	protected int age = 23;
 	
}
public class CuctomerDriver 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
	 Customer c2 = new Customer();
	Customer c3 =  new Customer();
	
	 System.out.println(c1.lastname);
	 System.out.println(c2.age);
	 //System.out.println(c3.fname);
		
	}

}

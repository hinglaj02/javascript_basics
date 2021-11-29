package com.greatlearning.corejava;

public class ConstructorDemo {

	
	ConstructorDemo(){
		
		System.out.println("I am a default Constructor");
		
	}
	
	
	public ConstructorDemo(int a, float b, String s,char c)
{
		
		System.out.println("I am Parameterized constructor. I take various arguments as input "+"like : "+ " Interger =" + a +"   "+" Float = "+ b + "  "+ "String =  " + s+ " Character = " + c);
		
		
	}
	

ConstructorDemo(int a, float b)
{
	
	System.out.println("Square of above integer is = " +a*a);
	System.out.println("Square of above shown float is = " + b*b);
	
}
public void observations()
{
	System.out.println("Inside Observations Methods");
}
	

	public static void main(String args[]) {
	
	ConstructorDemo K1 = new ConstructorDemo();
	
	ConstructorDemo K = new ConstructorDemo(4, 5, "Hellow", 'c');
	
ConstructorDemo K3 = new ConstructorDemo(4, 5);
  K1.observations();
 
 
	
	
}}

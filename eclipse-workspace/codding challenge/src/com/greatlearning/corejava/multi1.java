package com.greatlearning.corejava;

class Area1
{
	public int a = 10;
	
}
 class B extends Area1
 {
	 public int b = 20;
	 
 }
 
 class C extends B
 {
	public void circle()
	{
		int c = 22 / 7 * a*a;
System.out.println("area of cirle is " +c);		 
	}
	public void triangle()
	{
		int t = b*b*b;
		System.out.println("area of triangle is " +t);
		
	}
	public void rectangle()
	{
		int r = 2*(a+b);
		System.out.println("area of rectangle is " +r);
	}
	
	
	
	}
 
public class multi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C obj = new C();
obj.circle();
obj.triangle();
obj.rectangle();
	}

}

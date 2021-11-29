package Practise;

abstract class shape
{
	abstract void draw();
}

 class show1 extends shape
 {
	 
	 public void draw()
	 { 
	 System.out.println("Square");
	 
}}
	 class show2 extends shape
	 {
		 public void draw()
		 
		 {
			 System.out.println("Circle");
			 
		 }

	
	 }

public class Show_abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shape s1  = new show1();
		s1.draw();
		shape s2 = new show2();
		s2.draw();
		

	}}

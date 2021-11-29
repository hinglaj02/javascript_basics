package com.greatlearning.corejava;

class A {
	
	static int var1 = 10;
	//final int var1 = 10;
	int var2 = 10;
	
	public void method1()
	{
		System.out.print(var1++ +"  ");
	}
	
	public void method2() {
		System.out.println(var2++);
	}
}

public class StaticFinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			A a1 = new A();
			A a2 = new A();
			A a3 = new A();
			
			a1.method1(); a1.method2();
			a2.method1(); a2.method2();
			a3.method1(); a3.method2();
			}
		
	}



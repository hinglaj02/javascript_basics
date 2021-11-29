package com.greatlearning.corejava;

class Health1{
	 protected int age = 2;
	 protected float bmi = 3;
	 protected float weight =  4;
	 
	
}

public class Health {

	public static void main(String args[])
	{
		Health1 h1 = new Health1();
		Health1 h2 = new Health1();
		Health1 h3 = new Health1();
		System.out.println(h1.age);
		System.out.println(h2.bmi);
		System.out.println(h3.weight);
		
	}}

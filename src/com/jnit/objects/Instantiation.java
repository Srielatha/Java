package com.jnit.objects;
//it executes the same order as it appears in the file
//instance variables, instance intializers and constructors
public class Instantiation {
	
	int x = 10;
	
	{
		System.out.println(x);
		x = 20;
		System.out.println(x);
	}
	
	public Instantiation(){
		x=30;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		Instantiation x = new Instantiation();
	}

}

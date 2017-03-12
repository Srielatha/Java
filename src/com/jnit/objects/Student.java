package com.jnit.objects;
//A constructor is used to construct an object
//default constructor is provided by JVM automatically
//a constructor doesn't return a value

//instance variables gets a default value
//all local variables must be initialized before usage
//all local variables are created inside stack memory
//all instance variables are created inside the heap memory
public class Student {

	String name;
	int age;
	int rollNo;
	
	public Student(){
		
	}
	
	public void play(){
		int x =30;
		{
			int y=20;
		}
		
		if(x==30){
			int r=20;
		}
//		System.out.println(y);
	}
}

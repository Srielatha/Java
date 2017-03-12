package com.jnit.objects;

public class Instantiation1 {

	{
		//System.out.println(x);
		x=10;
		//System.out.println(x);
	}
	
	int x=m1();
	
	
	{
		System.out.println(x);
	}
	
	public int m1(){
		int z = 30;
		{
			int y = 20;
		}
		return 20;
	}
	
	public Instantiation1(){
		x=30;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		new Instantiation1();

	}

}

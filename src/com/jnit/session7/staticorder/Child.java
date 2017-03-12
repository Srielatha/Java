package com.jnit.session7.staticorder;
//Parent first then child
//static inside parent and then static inside child
//instance initializers inside parent and then constructor inside parent
//instance initializers inside child and then constructor inside child
public class Child extends Parent {
	
	private static int y = 20;

	static {
		System.out.println("I am inside child static initializer 1");
	}

	{
		System.out.println("I am inside child instance initializer 1");

	}
	
	Child(){
		//super();
		System.out.println("I am inside child constructor");
	}

	static {
		System.out.println("I am inside child static initializer 2");
	}

	{
		System.out.println("I am inside child instance initializer 2");

	}
	
	public static void print(){
		System.out.println("Print child");
	}
	
	public static void main(String[] args) {
		new Child();
	}
}

package com.jnit.session8.interfacedemo;
//abstract methods
//variables- public/static/final
//Java-8 -> static methods in interfaces/default methods
//define contracts, adds behavior to classes
//an interface can extend one or more interface
//A class can implement more than one interface
//a method which is created with default keyword
public interface Pet {
	double PI=3.14;
	//no private,final,protected
	void test();
	void add(String x, int y);
	
	//int sum(int x, int y);
	default void doSomething(){
		
	}
	
	static void print(){
		System.out.println("hello");
	}
	
}

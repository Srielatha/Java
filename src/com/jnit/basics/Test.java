package com.jnit.basics;
//fields(members-> state) and methods(modify/update the state)
//Integral data types -> byte,short,int,long
//decimal data types//float and double
//char and boolean//character and boolean

//widening conversions
//byte,short,int,long,float,double
//byte->short, int, long,float,double
//sort -> int,long,float,double
//int -> long,float,double
//long-> float and double
//float -> double
//char -> int,long,float and double

//accessmodifier static(if it is) returntype nameofthemethod(paramas...)
/**
 * @author appi
 * This is a very basic class
 */
public class Test {

	public int sum(int a, int b){
		return a+b;
	}
	
	public static int test(){
		return 1;
	}
	//main method is the starting point of the program
	//public -> access modifier
	//static -> keyword in java which helps JVM to run your main method without an object created
	//void -> defines return type
	public static void main(String[] args) {
		System.out.println("Hello world");
/*		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
*/	
	 int x = 10000;
	 byte b = (byte)x;
	 System.out.println(b);
	 //long(l,L),float(f,F), double(d,D)
	 
	 long r = 123777798899l;
	 float f = 1.2f;
	 float f1 = 100;
	 
	 char c = 'A';
	 
	 char c1 = 658;
	 int e = c1;
	 System.out.println(c1);
	 System.out.println(e);
	 System.out.println("--------------");
	 int r1 = 10000;
	 char c2 = (char)r1;
	 System.out.println(c2);
	 test();
	 
	}
	
}

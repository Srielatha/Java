package com.jnit.objects;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.age=10;
		s1.name = "Ravi";
		Student s2 = new Student();
		s2.age=12;
		s2.name = "Ramu";
		
		System.out.println(s1.name);
		System.out.println(s1 instanceof Student);
		s1 = s2;
		System.gc();
		s1= null;
//		System.out.println(s1);
		int string = 10;
		
		String x = "hello";
		System.out.println(x.length());
		
		//int v = 5.6;
	}
}

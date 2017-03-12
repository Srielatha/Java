package com.jnit.session5.exceptions;

import com.jnit.objects.Student;

//checked exceptions = compiler checked exceptions
//unchecked exceptions = run time exceptions
//Exception hierarchy(Throwable-> exception->runtimexception,error)
public class Main {

	public static void main(String[] args) {
		//null pointer, indexoutofbounds, Illegalargument, Illegalstate..
		//Student s1  = null;
		//s1.play();
		//String s = null;
		//s.concat("hello");
		//Exception in thread "main" java.lang.NullPointerException
		//at com.jnit.session5.exceptions.Main.main(Main.java:13)
		int[]numbers = {1,2,3,4,5};
		//numbers[10]= 100;
		
		String s = "hello";
		//System.out.println(s.charAt(6));
		
		//int i = 1000;
		//byte b = (byte)i;
		//System.out.println(b);
	}

}

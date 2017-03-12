package com.jnit.session2.operators;

//&,|,^
//&- true and true ->true
public class BitwiseOperators {

	public static void main(String[] args) {
		int x = 20;
		
		int r = 10 & 20;//01010 & 10100 = 00000	
		int p = 10 | 20; //01010 & 10100 =11100
		
		System.out.println(r);
		System.out.println(p);
		
		if (x >=5 & x<=10){
			System.out.println("between 5 and 10");
		}
		
		if (x >=5 | x<=10){
			System.out.println("between 5 and 10");
		}
		
		
	}

}

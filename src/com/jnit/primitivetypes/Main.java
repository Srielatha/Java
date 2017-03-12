package com.jnit.primitivetypes;
//decimal
//binary -> 0b,0B -> base 2
//hex -> 0x,0X ->base 16
//Oct ->0->base 8
//should not start/end with an underscore
//should not be before decimal and after decimal
public class Main {

	public static void main(String[] args) {
		
		int x=10;
		int r=0b11;//1*2pwe0+18wpower 1
		int t = 0XA1;//1+10*16 = 161
		int o = 012;
		int m=666_66_6666;
		//double d =3$8.14;
		float f = 1.2f;
		System.out.println(r);
		System.out.println(t);
		System.out.println(o);
		
	}

}

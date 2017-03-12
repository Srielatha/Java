package com.jnit.session2.operators;

//rules for numeric promotion
//if operand has same data type, there wont be any numeric promotion
//if one of the operand has a larger data type, then the smaller ones are promoted to larger ones
//for smaller data types the variable promotion always happen(byte,short and char)
//if we have a decimal data type, other operands are also promoted to decimal data type
//== comparison also has numeric promotion

//numeric promotion gets applied automatically-> compound assignment operation
public class NumericPromotion {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = x + y;

		byte b = 5;
		byte b1 = 6;

		byte b2 = (byte) (b + b1);

		int x1 = 2;
		long r = 10;
		long x4 = x1 + r;

		short xa = 14;
		float yb = 13;
		double zc = 30;

		double d = xa * yb / zc;
		
		int u1=3;
		int ux = u1+=3;
		
		long xb = 10;
		int yr = 5;
		//yr = yr * xb;
		yr *= xb;
	}

}

package com.jnit.session3.arrays;

import java.util.Arrays;

//equals -> compares references
//Arrays.equals -> content comparision
public class Main {

	public static void main(String[] args) {
		int[]a = {};
		int[]b = {1,6,3,4};
		int c[] = {1,2,3,4,5};
		int d[] = new int[5];//0,1,2,3,4
		int e[] = new int[]{0,1,2,3,4};
		d[0] = 1;
		d[2] = 4;
		//d[10] = 10;
		System.out.println(b);
		System.out.println(Arrays.toString(b));
		System.out.println(b.length);
		Arrays.sort(b);
		
		for(int i=0; i<b.length;i++){
			System.out.println(b[i]);
		}
		System.out.println(d.length);
		int[][]a2d = {{1,2,3},{3,4}};
		int[]a2d1[] = {{1,2,3},{3,4}};
		int a2d2[][] = {{1,2,3},{3,4}};
		int a2d3[][] = {};
		int a2d4[][] = new int[2][3];
		int a2d5[][] = new int[2][];
		a2d5[0] = new int[3];
		
		for(int i=0; i<a2d.length;i++){
			for(int j=0; j<a2d[i].length;j++){
				System.out.println(a2d[i][j]);
			}
		}
		
		//3d
		int[][][]a3d = {{{1,2,3},{3,4}}};
		int[]a3d1[][] = {{{1,2,3},{3,4}}};
		int a3d3[][][] = {{{1,2,3},{3,4}}};
		int a3d4[][][] = {};
		int a3d5[][][] = new int[2][3][4];
		int a3d6[][][] = new int[2][][];
		int a3d7[][][] = new int[2][][];
		
		Object[]abc = new Object[5];
		String[] abcd = new String[4];
		Object[]abcds = abcd;
		abcds[0] = new StringBuffer("hello");
		String[]abdcdd = (String[])abcds;
		

	}

}

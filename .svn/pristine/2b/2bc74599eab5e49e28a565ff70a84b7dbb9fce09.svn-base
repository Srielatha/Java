package com.jnit.session3.loops.labels;

public class LabelMain {

	public static void main(String[] args) {
		int[][] array2d = { { 1, 2, 3 }, { 4, 5, 6 }, { 6, 7 } };
		OUTER_LOOP: for (int i = 0; i < array2d.length; i++) {
			INNER_LOOP: for (int j = 0; j < array2d[i].length; j++) {
				System.out.println(i + "=" + array2d[i][j]);
			}
		}

		int[][] list = { { 1, 13, 5 }, { 1, 2, 5 }, { 2, 7, 2 } };
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					break PARENT_LOOP;
				}
			}
		}
		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
		}

		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b')
					continue FIRST_CHAR_LOOP;
				System.out.print(" " + a + x);
			}
		}

	}

}

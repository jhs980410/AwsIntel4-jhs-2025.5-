package ch5_Arraytest;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTest200 {

	public static void main(String[] args) {

		int[][] gugudan = new int[9][9];
		
		for (int i = 0; i < gugudan.length; i++) {
			
			for (int j = 0; j < gugudan[0].length; j++) {
				gugudan[i][j] = (i+1*j);
				System.out.println(gugudan[i][j]);
			}
		}
		
		
		
	}

}

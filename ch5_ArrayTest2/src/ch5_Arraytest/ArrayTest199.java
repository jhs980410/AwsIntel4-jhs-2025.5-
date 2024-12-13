package ch5_Arraytest;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTest199 {

	public static void main(String[] args) {

		int[][] numArr = new int[4][6];
//		int count = 0;
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[0].length; j++) {
//				numArr[i][j] = (6*i)+j+1;

				System.out.print((numArr[i][j] = (numArr[0].length * i) + j + 1) + "\t");

			}
			System.out.println();

		}
		System.out.println(numArr[0][2]);

	}

}

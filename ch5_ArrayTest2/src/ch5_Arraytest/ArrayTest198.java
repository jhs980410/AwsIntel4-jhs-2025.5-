package ch5_Arraytest;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTest198 {

	public static void main(String[] args) {
		// 구구단인데 , 배열에 구구단의 결과 값을 저장하고 /
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단수를 입력");
		int n = sc.nextInt();
		int[] gugudan = new int[9];
		for (int i = 0; i < gugudan.length; i++) {
			gugudan[i] = n * (i + 1);
			System.out.println(n + " * " + (i + 1) + " = " + gugudan[i]);

		}

	}

}

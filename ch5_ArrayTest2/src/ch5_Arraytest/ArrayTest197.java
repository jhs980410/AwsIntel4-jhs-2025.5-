package ch5_Arraytest;

import java.util.Iterator;

public class ArrayTest197 {

	public static void main(String[] args) {

		int[] numArr = { 
				79, 88, 91, 33, 100, 55, 95 
			};
		int min = numArr[0]; // 가장 작은수를 담을 변수
		int max = 0; // 가장 큰 수를 담을 변수
		for (int i = 0; i < numArr.length; i++) {
			if (min > numArr[i]) {
				min = numArr[i]; // min 값은 numArr[0] (79) 인데 , 1번째 반복에서 79 > numArr[0] "true"면 min의 값이 0번인덱스 값으로
			} else if (max < numArr[i]) {
				max = numArr[i]; // max 값은 0인데 , 1번째 반복에서 0 < numArr[0] "true"면 max의 값이 0번인덱스 값으로
			}
			// 이것을 numArr의 길이만큼 반복한다. //
		}
		System.out.println("가장 작은수는: " + min +  "\n가장 큰수는: " + max);

	}

}

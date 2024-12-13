package ch5_Arraytest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {

//		배열에 들어있는 임의의 숫자들을 작은 값에서 큰값으로 정렬하시오
//  0번 부터  5번 인덱스까지  순차적으로 돌려서 낮은거 출력 , 낮은거출력 , 낮은거출력 출력  
		
		Scanner sc = new Scanner(System.in);
		int[] jumsuArr = new int[5];
		for (int i = 0; i < jumsuArr.length; i++) {
//			jumsuArr[i] = sc.nextInt();
			jumsuArr[i] = (int) (Math.random() * 100);
		}
		for (int i = 0; i < jumsuArr.length; i++) {
			System.out.println(jumsuArr[i]);
			
		}
//		 for (int i = 0; i < 5; i++) {  // 5번의 반복
//	            for (int j = 0; j < 5 - i; j++) {  // 남은 요소들만 비교
//	                // 인접한 두 값을 비교하여 교환
//	                if (jumsuArr[j] > jumsuArr[j + 1]) {
//	                    // 교환
//	                    int temp = jumsuArr[j];
//	                    jumsuArr[j] = jumsuArr[j + 1];
//	                    jumsuArr[j + 1] = temp;
//	                }
//	            }
//	        }
//
//	        // 정렬된 배열 출력
//	        System.out.println("정렬된 배열:");
//	        for (int i = 0; i < 6; i++) {
//	            System.out.print(jumsuArr[i] + " ");
//	        }
		
			

	}

}

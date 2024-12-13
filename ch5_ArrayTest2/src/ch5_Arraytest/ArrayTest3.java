package ch5_Arraytest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] countArr = new int[10];
		for (int i = 0; i < numArr.length; i++) {
			//배열 10개에 0~9까지할당// 
			numArr[i] = (int)(Math.random()*10);
		}
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("랜덤값 "+i+"번인덱스"+" = "+numArr[i]);
			
		}
		
		System.out.println("=================================");
		for (int i = 0; i < countArr.length; i++) {
			for (int j = 0; j < countArr.length; j++) {
				if (numArr[j] == i) {
					countArr[i] = countArr[i]+1; 
				} //1. i -> 0 일시  j는 0~9까지 돈다 ,다중반복문 // 
				 // 2. if문으로 numarr[i]인덱스 값과 i와 같으면  countArr[i] +1을 한다. 
				// ex : numarr[0~9]중  i가 0일때랑 겹치면 // countArr[0]에 +1 //    							
			}	
			System.out.println(i+"는" + countArr[i]+"개 입니다." );
		}
		
		
		

	}

}

package hk.exam.three;

import java.util.Iterator;

public class RectangleService {
	
	// 정사각형을 출력한다
	public void printRectangle(int line){

		// 라인
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
			// 직각삼각형
		System.out.println();
		for (int i = 0; i < line; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		System.out.println();
			// 역직각삼각형
		for (int i = 0; i < line; i++) {
			for (int j = line; i < j ; j--) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}	
			
			
		
		
	}
	
}
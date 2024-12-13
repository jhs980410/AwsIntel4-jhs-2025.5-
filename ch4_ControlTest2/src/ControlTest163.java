import java.util.Iterator;

public class ControlTest163 {
	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//			// 줄 //
//			for (int j = 5 - (i + 1); j < 5; j++) {
//				System.out.print("*");
//				// 별갯수 //
//			}
//			System.out.println(); // 출력후 줄띄기 //
//		}
//		
//		// 1.int i = 0; , i < 5 비교 -> true -> 실행문() -> 중첩 반복문 -> println() -> i++ -> 조건식
//		// -> 실행문
//		// int j = int j = 5 - (i+1)
//		// 1번째 반복 = (int j = 5 - (i+1) , 4 < 5보다 작음 -> 별하나출력 -> j++ 하는순간 5보다 커짐 /
//		// i++후 2번째 반복 = (int j = 5 - 2(i) , 3 < 5보다 작음 -> 별하나출력 -> j++ -> 한번더 실행(총2번)

//		for (int i = 0; i < 12; i++) {
//			for (int j = 0; j < 12 - i; j++) {
//				System.out.print("*");
////				if (j / 6 == 0) {
////					System.out.print(" ");
////				}
//			}
//			System.out.println();
//			
//		}

//		for (int i = 0; i <= 4; i++) {
//			for (int j = 0; j < 5 - i ; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 2 * i - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

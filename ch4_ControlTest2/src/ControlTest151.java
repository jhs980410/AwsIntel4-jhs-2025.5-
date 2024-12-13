
public class ControlTest151 {
	public static void main(String[] args) {
//		for (int i = 1; i <= 3; i++) {
//			//  줄  // 
//			for (int j = 1; j <= 5 ; j++) {
//				System.out.print("*");
//				//별갯수 // 
//			}
//			System.out.println(); // 출력후 줄띄기 // 
//		}
		// 5~1까지 // 
//		for (int i = 1; i <= 5; i++) {
//			//  줄  // 
//			for (int j = 6-i; j > 0 ; j--) {
//				System.out.print("*");
//				//별갯수 // 
//			}
//			System.out.println(); // 출력후 줄띄기 // 
//		}
// 1~5까지 
//		for (int i = 1; i <= 5; i++) {
//			// 줄 //
//			for (int j = 5 - i; j < 5; j++) {
//				System.out.print("*");
//				// 별갯수 //
//				//1번째 반복 = (int j = 5 - 1(i) , 4 < 5보다 작음 -> 별하나출력 -> j++ 하는순간 5보다 커짐 /   
//			}
//			System.out.println(); // 출력후 줄띄기 //
//		}
		// 4공백부터 시작하는 삼각형 //
//		for (int i = 1; i <= 5; i++) {
//			// 줄 //
//			for (int j = 6-i; j > 1; j--) {
//				System.out.print(" ");
//				// 공백 //
//			}
//			for (int j = 5 - i; j < 5; j++) {
//				System.out.print("*");
//				// 별갯수 //
//			}
//			System.out.println();
//			
//		}
//피라미드 //  
		for (int i = 1; i <= 5; i++) {
			for (int j = 6 - i; j > 1; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

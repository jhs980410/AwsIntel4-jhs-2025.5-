package ch5_Arraytest;

public class ArrayTest189 {

	public static void main(String[] args) {

		int[] ballArr = new int[45];// ballArr[0] ~ 45는 현재 000000000000으로 도배된상태
		for (int i = 0; i < ballArr.length; i++) {
			ballArr[i] = i + 1;
			// ballArr[i] = 0번부터 1~45 삽입 //
		}
		for (int i = 0; i < ballArr.length; i++) {
			
			System.out.print(ballArr[i] + "\t"); // 출력하다가  // 
			if ((i+1) % 5 == 0) { // 0번인덱스 %  나머지가  0일경우 syso 줄띄기 발생이 되니 //  i+1  = 1로 시작하여 5의 배수 일경우 줄띄기 // 
				
				System.out.println();
			}
			// ballArr[i]에 저장된 값을 45번만큼 출력
		}

		System.out.println(); // 공백 //
//		int tempBall = 0; // tempBall 변수를 선언후 0을 할당
//		int randNum = 0; // randNum 변수를 선언후 0을 할당
//		
//		for (int i = 0; i < 6; i++) {
//			//6번을 반복할건데, 
//			randNum = (int)(Math.random() * 45); // i = 0 일때 1~45의 랜덤값을 삽입 
//			tempBall = ballArr[i]; // 
//			ballArr[i] = ballArr[randNum];
//			ballArr[randNum] = tempBall;
//		}
//		for (int i = 0; i <  6; i++) {
//			System.out.print(ballArr[i] + "\t");
//			
//		}

	}

}

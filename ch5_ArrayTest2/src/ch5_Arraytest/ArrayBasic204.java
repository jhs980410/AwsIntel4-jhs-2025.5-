package ch5_Arraytest;



public class ArrayBasic204 {
//1. "홀짝게임" 을 입력하면 게임이 실행되는  게임  / 종료를 누르면 종료되게 / 
	// 2. 컴퓨터는 1~10까지 랜덤값을 받음 / 사용자는 홀인지 짝인지 맞춰서 맞추면 "정답" 틀리면 "틀렸다" 라고 한다.
	// 3. 맞추던 틀리던 재시작하겠습니까? // Y , N // N ---> 종료 Y--> 재시작 -->
	public static void main(String[] args) {
		
//		int[][] numArr = new int[4][3];
//		numArr[0][0] = 0;
//		numArr[0][1] = 0;
//		numArr[0][2] = 0;
//		numArr[1][0] = 0;
//		numArr[1][1] = 0;
//		numArr[1][2] = 0;
//		numArr[2][0] = 0;
//		numArr[2][1] = 0;
//		numArr[2][2] = 0;
//		numArr[3][0] = 0;
//		numArr[3][1] = 0;
//		numArr[3][2] = 0;
//		
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 3; j++) {
//				numArr[i][j] = numArr[i][j]+1;	
//			}
//			
//		}
		
		int[][] numArr = new int[2][3];
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr.length+1; j++) {
				if (i == 0) {
					numArr[i][j] = 1;
				}
				if (i == 1) {
					numArr[i][j] = 2;
				}
				System.out.println(numArr[i][j]);
			}
		}
		
	}
}

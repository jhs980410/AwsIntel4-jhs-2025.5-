package ch5_Arraytest;

public class ArrayTest1 {
	public static void main(String[] args) {

//		배열에 
//		20, 40, 60, 80, 100, 13점을 넣고
//		
//		총점과 평균점수를 구하시오 
//		(평균의 경우 소수점 3번째 자리에서 반올림한다)
//		
//		총점: 313
//		평균: 52.166666,,,
//		평균 반올림: 52.17

		double sum = 0;
		int[] scoreArr = new int[6];

		for (int i = 0; i < scoreArr.length; i++) {
			scoreArr[i] = (int) (Math.random() * 100) + 1;
			sum += scoreArr[i];
		}
		
		double avg = sum / scoreArr.length;
		System.out.println("총점: " + (int) sum);
		System.out.println("평균: " + avg);
		System.out.println("평균 반올림: " + Math.round(avg * 100) / 100.0);

	}
}
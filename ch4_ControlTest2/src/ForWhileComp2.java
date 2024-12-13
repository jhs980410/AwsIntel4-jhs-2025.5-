
//학생이름 ,성적 ,학년 , 학생들의 평균점수 , 최고점수 , 최저점수 ,  

import java.util.Scanner;

public class ForWhileComp2 {
	public static void main(String[] args) {
		int sum = 0; // 합계값
		int num = 0;
		boolean strat = true;
		while (strat) {
			num++;
			if (num % 2 == 0) {
				sum += num;
				if (num == 100) {
					strat = false;
				}

			}

		}
		System.out.println(sum);
	}
}
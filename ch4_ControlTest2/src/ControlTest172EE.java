
//학생이름 ,성적 ,학년 , 학생들의 평균점수 , 최고점수 , 최저점수 ,  

import java.util.Iterator;
import java.util.Scanner;

public class ControlTest172EE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];

		name[0] = "찬미";
		name[1] = "유혁";
		name[2] = "유빈";
		name[3] = "현식";
		name[4] = "진우";
		int[] age = new int[5];
		age[0] = 27;
		age[1] = 27;
		age[2] = 26;
		age[3] = 27;
		age[4] = 32;
		String[] gender = new String[2];
		gender[0] = "남자";
		gender[1] = "여자";
		int num1 = 0;
		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random() * 100+1);

		}
		boolean start = true;
		while (start) {
			System.out.println("원하는 목록을 선택하세요.");
			System.out.print("1. 성적조회\n2. 학생조회\n3. 평균점수\n4. 최고점수\n5. 최하점수\n6. 종료 ");
			num1 = sc.nextInt();
			switch (num1) {
			case 1:
				for (int i = 0; i < name.length; i++) {
					System.out.println(name[i] + " 님은 " + (i + 1) + "  을 입력하세요 ");
				}
				int num2 = sc.nextInt();
				switch (num2) {
				case 1:
					System.out.println(name[0] + "님은" + score[0] + " 점 입니다.");
					System.out.println();
					break;
				case 2:
					System.out.println(name[1] + "님은" + score[1] + " 점 입니다.");
					System.out.println();
					break;
				case 3:
					System.out.println(name[2] + "님은" + score[2] + " 점 입니다.");
					System.out.println();
					break;
				case 4:
					System.out.println(name[3] + "님은" + score[3] + " 점 입니다.");
					System.out.println();
					break;
				case 5:
					System.out.println(name[4] + "님은" + score[4] + " 점 입니다.");
					System.out.println();
					break;

				}break;

			case 2:
				System.out.println("무엇이 궁금하십니까?\n 1.성별\t2.나이");
				int num3 = sc.nextInt();
				switch (num3) {
				case 1:
					System.out.println(name[0] + " 님은 " + gender[1] + " 입니다.");
					System.out.println(name[1] + " 님은 " + gender[0] + " 입니다.");
					System.out.println(name[2] + " 님은 " + gender[1] + " 입니다.");
					System.out.println(name[3] + " 님은 " + gender[0] + " 입니다.");
					System.out.println(name[4] + " 님은 " + gender[0] + " 입니다.");
					System.out.println();
					break;
				case 2:
					System.out.println(name[0] + " 님은 " + age[0] + "세 입니다.");
					System.out.println(name[1] + " 님은 " + age[1] + "세 입니다.");
					System.out.println(name[2] + " 님은 " + age[2] + "세 입니다.");
					System.out.println(name[3] + " 님은 " + age[3] + "세 입니다.");
					System.out.println(name[4] + " 님은 " + age[4] + "세 입니다.");
					System.out.println();
					break;

				}
				break;
			case 3:
				int avg = 0;
				for (int i = 0; i < score.length; i++) {
					avg += score[i];
				}
				System.out.println("5명의 평균점수는 " + avg/5 + " 점 입니다.");
				break;
			case 4:
				int max = 0; 
				for (int i = 0; i < score.length; i++) {
					if (max < score[i]) {
						max = score[i];
					}					
				}
				System.out.println("최고점수는 " + max + " 점 입니다.");
				break;
			case 5:
				int min = score[0]; 
				for (int i = 0; i < score.length; i++) {
					if (score[i] < min) {
						min = score[i];
					}					
				}
				System.out.println("최하점수는 " + min + " 점 입니다.");
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				start = false;
				break;
			}
			
		}

	}
}
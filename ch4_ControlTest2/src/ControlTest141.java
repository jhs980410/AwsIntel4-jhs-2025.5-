import java.util.Scanner;

public class ControlTest141 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		
		if (score > 100 || score < 0 ) {
			System.out.println(score + "점은 " + "잘못입력되셨습니다.");
		}else if (score >= 90) {
			System.out.println(score + "점은 " + "A 학점 입니다.");
		}else if (score >= 80) {
			System.out.println(score + "점은 " + "B 학점 입니다.");
		}else if (score >= 70) {
			System.out.println(score + "점은 " + "C 학점 입니다.");
		}else {
			System.out.println(score + "점은 " + "F 학점 입니다.");
		}
		
		
		}
	
}



import java.util.Scanner;

public class ControlTest172 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;   //누적금액 
		int count = 0; // 횟수 
		int money = 0; // 사용자 입력값 // 
		boolean start = true;
		while (start) {
			System.out.println("1.금액입력하기\n0.총합계산 및프로그램종료 ");
			int num = sc.nextInt();
			switch (num) {
			case 0: 
				System.out.println(count+"번 구매한 총 금액은 " + sum + " 원 입니다.");
				System.out.println("프로그램을 종료합니다.");
				start = false;
				break;
			case 1:
				System.out.println("금액을 입력하세요.");
				money = sc.nextInt();
				sum += money;
				count++;
				System.out.println("누적금액 : " + sum+"\n");
				break;
			case 2:
				System.out.println("2이하로 입력하세요.\n" );
				
				break;
			}
							
		}
		
	}
}

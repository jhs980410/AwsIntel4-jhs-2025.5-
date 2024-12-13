import java.util.Scanner;

public class ControlTest140 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("-999가 아닌 수를 입력하세요.");
		int num = sc.nextInt();
		
		if (num != -999) {
			System.out.println("1.남성 \n2.여성");
			int gender = sc.nextInt();
			if (gender == 1) {
				System.out.println("남성을 선택했습니다"); //IF문에 IF문 // 
			}else if (gender == 2) {
				System.out.println("여성을 선택했습니다");
			}
		}else if (num == -999) {
			System.out.println("프로그램을 종료");
		}
		
			
	
		
			
		
	}

}

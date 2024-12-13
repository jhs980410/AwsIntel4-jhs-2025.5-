import java.util.Scanner;

import javax.security.auth.kerberos.KerberosTicket;

public class ControlTest146 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1~12월중 원하시는 월을 입력하시오");
		int key = sc.nextInt();
		if (key <= 12 && key != 0) {
			switch (key) {
			case 1:	
			case 2:
			case 12:
				System.out.println(key + "월은 겨울입니다." );
				break;
			case 3:
			case 4:
				System.out.println(key + "월은 봄입니다." );
				break;
			case 5:
			case 6:
			case 7:
			case 8:
				System.out.println(key + "월은 여름입니다." );
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(key + "월은 가을입니다." );
				break;

			}
		} else {
			System.out.println("12월이후는 없습니다.");
		}

	}
}

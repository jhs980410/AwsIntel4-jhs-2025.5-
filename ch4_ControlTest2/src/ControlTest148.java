import java.util.Scanner;

import javax.security.auth.kerberos.KerberosTicket;

public class ControlTest148 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요");
		int num = (int) (Math.random() * 100);
		if (num % 3 == 0 && num != 0) {
			System.out.println(num + " = 3의 배수입니다.");
		}else if (num == 0) {
			System.out.println("0입니다.");
		}
		else {
			System.out.println(num + " =  3의 배수가 아니다.");
		}
		if (num % 2 == 0) {
			System.out.println(num + " = 짝수");
		}else {
			System.out.println(num + " = 홀수");
		}
		
		

	}
}

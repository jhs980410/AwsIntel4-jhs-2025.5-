import java.util.Scanner;

import javax.security.auth.kerberos.KerberosTicket;

public class ControlTest147 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		String str = "";
		if (score >= 90) {
			str = "A";
			if (score > 94 && score < 98) {
				str = str + "-";
			} else if (score >= 98) {
				str = str + "+";
			}
		} else if (score >= 80) {
			str = "B";
			if (score > 84 && score < 88) {
				str = str + "-";
			} else if (score >= 88) {
				str = str + "+";
			}
		} else {
			str = "F";
		}
		System.out.println("당신의 학점은 " + score + "점 " + str + "등급입니다.");
	
		

	}
}

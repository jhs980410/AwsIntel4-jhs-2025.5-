package four39;

import java.util.Scanner;

public class MyExceptionMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력");

		
		try {
			int num = scan.nextInt();
			
			System.out.println(100 / num);
		} catch (MyException e) {
			// TODO: handle exception
			
			System.out.println(e.getMessage());
			e.myIns();
		}
		
	}
	
}

import java.util.Scanner;

public class VarTest5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		System.out.println("두수의 나눈 값의 몫을 구하여라.");
		System.out.println("첫번째 수 입력 ");
		x = scanner.nextInt();
		System.out.println("두번째 수 입력 ");
		y = scanner.nextInt();
		
		System.out.println("x / y : " + (double) x / (double) y);
		System.out.println("x + y : " + (double) x + (double) y);
		System.out.println("x * y : " + (double) x * (double) y);
		System.out.println("x % y : " + (double) x % (double) y);
		
	}

}
//1234 / 33 = 37.39393939393939
//1234 / 33 = 37.39393939393939
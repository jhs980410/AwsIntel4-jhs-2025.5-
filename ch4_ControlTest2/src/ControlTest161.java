import java.util.Scanner;

public class ControlTest161 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단수 입력");
		int dan = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}

	}
}

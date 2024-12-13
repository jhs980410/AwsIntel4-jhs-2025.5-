import java.util.Scanner;

public class OperatorTest130 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		
		System.out.println(x == 0 ? "입력값 : 0" : (x > 0 ? "입력값 : " + x + " -> 양수 "  : "입력값 : " + x + " -> 음수 "));
		
		
			
		
	}

}

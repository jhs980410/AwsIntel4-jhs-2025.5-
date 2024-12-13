import java.util.Scanner;

public class VarTest3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 실수입력");
		double re = scanner.nextDouble();
	
		int num = 0; 
		num=100;
		
		re = num;
		System.out.println("기존값: " + num);
		num =(int) re;
		System.out.println("입력값: " +  re);
		
		
	}

}

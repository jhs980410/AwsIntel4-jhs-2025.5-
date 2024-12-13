import java.util.Scanner;

public class VarTest2 {

	public static void main(String[] args) {
	
		int intnum1 = 42;
		double doubleNum = 0;
		
		System.out.println("정수값: " + intnum1 );
		System.out.println("실수값: " + doubleNum);
		doubleNum = intnum1;
		System.out.println();
		long longNum = 1000l;
		
		intnum1 = (int) longNum;
		System.out.println(": " + intnum1 );
		longNum = intnum1;
		System.out.println(": " + longNum );
		doubleNum = longNum;
		System.out.println(": " + doubleNum );
		longNum = (long)doubleNum;    //  정수 ------> 실수는  캐스팅연산자 사용해줘야함.  
		System.out.println(": " + longNum );
		float floatNum = 9000;
		System.out.println(": " + floatNum );
//		longNum = floatNum;
		System.out.println(": " + longNum );
				
	
	}

}

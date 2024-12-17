package ch6_Objecttest;

//사칙연산 계산기를 만들것인데 , 나누기는 소수점으로 // 
public class Calculator {

	void pius(int a, int b) {
		System.out.println("A + B : "+(a+b));
	}

	void minus(int a, int b) {
		System.out.println("A - B : " +(a-b));
	}

	void division(int a, int b) {
		System.out.println("A / B : "+a/(double)b);
	}

	void multiPlication(int a, int b) {
		System.out.println("A * B : "+a*b);
	}

}

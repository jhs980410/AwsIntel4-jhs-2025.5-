package ch6_Objecttest;

import java.lang.management.BufferPoolMXBean;

public class Calculator2 {

	void pius(int a, int b) {
		System.out.println(a+" + "+b +" = "+(a+b));
	}

	void minus(int a, int b) {
		System.out.println(a+" - "+b +" = "+(a-b));
	}

	void division(int a, int b) {
	
		if (b != 0) {
			double num = (int)(a/(double)b*100+1)/100.0 ;
			System.out.println(a+" / "+b +" = " + num);
		}else {
			System.out.println("0으로 나눌 수 없습니다. ");
			System.out.println("0");
		}
			
	}

	void multiPlication(int a, int b) {
		System.out.println(a+" * "+b +" = "+a*b);
	}

}

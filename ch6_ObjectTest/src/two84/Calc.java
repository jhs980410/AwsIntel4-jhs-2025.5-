package two84;

import javax.sql.rowset.JoinRowSet;

public class Calc {
	
	int add(int a, int b) {
		System.out.println("int a , int b");
		return a + b;

	}
	

	long add(int a, long b) {
		System.out.println("lnt a , long b");
		long result = a + b;
		return result;
	}

	long add(long a, int b) {
		System.out.println("long a , int b");
		long result = a + b;
		return result;
	}

	long add(long a, long b) {
		System.out.println("long a , long b");
		long result = a + b;
		return result;
	}
	  /// 위는 더하기 
	
	double division(int a, double b) {
		double result = (int)(a / b * 10)/10.0;
		return result;
	}
	double division(double a, double b) {
		double result = (int)(a / b * 10)/10.0;
		return result;
		
	}
	double division(double a, int b) {
		double result = (int)(a / b * 10)/10.0;
		return result;
		
	}
	
	
	
	
	
}

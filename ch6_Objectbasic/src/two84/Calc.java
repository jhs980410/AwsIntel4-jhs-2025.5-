package two84;

public class Calc {
	// 오버로딩 -> 같은 메서드를 여러개 정의 ( 매개변수의 갯수 , 타입 , 순서 등등이 달라야함 )
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
		long result = a + b;
		return result;
	}

}

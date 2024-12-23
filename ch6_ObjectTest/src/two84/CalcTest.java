package two84;

public class CalcTest {
	// 오버로딩 -> 같은 메서드를 여러개 정의 ( 매개변수의 갯수 , 타입 , 순서 등등이 달라야함 )
	public static void main(String[] args) {
		Calc calc = new Calc();
		double result = 0;
		int result1 = 0;
		long result2 = 0;
		result1 = calc.add(5, 3);
		System.out.println(result1);
		//int , int // 
		result2 = calc.add(5, 3L);
		System.out.println(result1);
		//int , long // 
		result2 = calc.add(5L, 3);
		System.out.println(result1);
		//long , int // 
		result2 = calc.add(5L, 3L);
		System.out.println(result1);
		//long , long // 
		
		result = calc.division(10, 3.0); //3.3 
		System.out.println(result);
		// int , double// 
		result = calc.division(10.0, 3);
		System.out.println(result);
		// double , int // 
		result = calc.division(10.0, 3.0);
		System.out.println(result);
		// double , double //  
	}

}

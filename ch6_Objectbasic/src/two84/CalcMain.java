package two84;

public class CalcMain {
	// 오버로딩 -> 같은 메서드를 여러개 정의 ( 매개변수의 갯수 , 타입 , 순서 등등이 달라야함 )
	public static void main(String[] args) {
		Calc calc = new Calc();
		int num1 =3;
		int num2 =10;
		int result = 0;
		result= calc.add(num1, num2);
		System.out.println(result);
		calc.add(num1, (long)num2);
		
		System.out.println(result);
	}

}

public class OperatorTest {

	public static void main(String[] args) {
		// 나누기에서는 나누는 수로 0 을 사용할 수 없다.//
//		System.out.println(3/0);
		double num =  3.145592;
		double resultNum = 0.0;
		
//		resultNum = (int) (num * 100 + 1)/100.0 ; 
//		System.out.println("소수점 3번째 자리에서 내림 즉 2자리 까지만 출력");
//		System.out.println(num + "-> " + resultNum);
		

		resultNum =num+0.005;
		System.out.println(resultNum);
		
		resultNum = resultNum * 100;
		System.out.println(resultNum);
		
		
		resultNum =(int) resultNum;
		System.out.println(resultNum);
		
		resultNum = resultNum/100.0;
		System.out.println(resultNum);
	
		
	}

}
//1234 / 33 = 37.39393939393939
//1234 / 33 = 37.39393939393939
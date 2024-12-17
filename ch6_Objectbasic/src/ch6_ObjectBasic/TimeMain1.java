package ch6_ObjectBasic;

public class TimeMain1 {
	public static void main(String[] args) {

		int h = 0;
		int m = 0;
		int s = 0;

		h = 2;
		m = 52;
		s = 26;
		
		//미국시간 - 14시간  
		
		
		System.out.println("한국 시간");
		System.out.println(h+":"+m+":"+s);
		System.out.println("일본 시간");
		System.out.println(h+":"+m+":"+s);
		System.out.println("미국 시간");
		System.out.println((h+24-14)+":"+m+":"+s);
	}
}

package ch6_ObjectBasic;

public class TvMain3 {

	public static void main(String[] args) {

		Tv tv = new Tv();
		// tv타입의 객체가 null로 생성후 ,
		// new 로 인한 주소가 할당된다 //   0x100 

		Tv tv2 = new Tv(); // 0x200 

		tv.channel = 7;
		// tv주소에 접근후 channel에 접근 -> 7로변경 //

		tv2 = tv;
		//0x200 = 0x100;  
		//tv2 = 0x100 
		
		tv2.channel = 17;
		// 0x100  = 17;
		
		System.out.println("현재채널은 " + tv.channel + " 입니다.");
		System.out.println("현재채널은 " + tv2.channel + " 입니다.");

	}

}

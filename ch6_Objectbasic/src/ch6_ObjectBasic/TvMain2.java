package ch6_ObjectBasic;

public class TvMain2 {

	public static void main(String[] args) {
		
		Tv tv;
		tv = new Tv();
		// tv타입의 객체가 null로 생성후 , 
		// new 로 인한 주소가 할당된다 //
		
		Tv tv2 = new Tv();
		
		tv.channel = 7;
		//tv주소에 접근후 channel에 접근 -> 7로변경  //  
		tv.channelDown();
		
		tv2.channel = 17;
		tv2.channelUp();
		System.out.println("현재채널은 " + tv.channel + " 입니다.");
		System.out.println("현재채널은 " + tv2.channel + " 입니다.");

	}

}

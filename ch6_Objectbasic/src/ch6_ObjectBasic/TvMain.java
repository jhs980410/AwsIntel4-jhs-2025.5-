package ch6_ObjectBasic;

public class TvMain {

	public static void main(String[] args) {
		
		Tv tv;
		tv = new Tv();
		// tv타입의 객체가 null로 생성후 , 
		// new 로 인한 주소가 할당된다 //
		tv.channel = 7;
		
		tv.channelDown();
		System.out.println("현재채널은 " + tv.channel + " 입니다.");

	}

}

package ch6_ObjectBasic;

public class TvMain4 {

	public static void main(String[] args) {

		Tv tv = new Tv();  // 0x100
		Tv tv2 = new Tv(); // 0x200 

		tv.channel = 7;    //0x100
		tv.color = "검은색"; //0x100 
		tv2.channel = tv.channel; //얇은복사 // 전체가아닌 객체안의 channel만 접근 // 
		tv2.color = tv.color; //  얇은복사 // 
		System.out.println("tv채널은 " + tv.channel + " 입니다."); //0x100
		System.out.println("tv색상은 " + tv.color + " 입니다."); // 0x100
		System.out.println("tv채널은 " + tv2.channel + " 입니다."); // 0x200
		System.out.println("tv색상은 " + tv2.color + " 입니다."); // 0x200 
		
		tv.color = "흰색"; 
		tv2.channel = 17;
		
		System.out.println();
		System.out.println("복제 이후 값 변경 ");
		System.out.println();
		System.out.println("tv채널은 " + tv.channel + " 입니다.");
		System.out.println("tv색상은 " + tv.color + " 입니다.");
		System.out.println("tv채널은 " + tv2.channel + " 입니다.");
		System.out.println("tv색상은 " + tv2.color + " 입니다.");

	}

}

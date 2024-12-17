package ch6_ObjectBasic;

public class CardMain {
	public static void main(String[] args) {
		System.out.println("카드.width: " + Card.width);
		System.out.println("카드.height: " + Card.height);
		System.out.println();
		
		Card c1 = new Card(); // c1이라는 Card 타입의 객체를 생성  0x100
		c1.kind = "heart";
		c1.number = 7;
		
		Card c2 = new Card(); // c2이라는 Card 타입의 객체를 생성  0x200 
		c2.kind = "spade";
		c2.number = 4;
		
		System.out.print("c1은 " + c1.kind +" ,"+ c1.number+"이며");
		System.out.println("크기는: " + c1.width +", "+ c1.height);       // 출력 
		System.out.print("c1은 " + c2.kind +" ,"+ c2.number+"이며");
		System.out.println("크기는: " + c2.width +", "+ c2.height);      // 출력 	
		System.out.println();
		c1.width = 50; // Card 클래스의 스태틱변수(공유변수)를 변경 , c1이든 c2든 상관없음 // 객체 생성없이 사용이 가능한 변수기때문에 가능은하다 
						// Card클래스에 접근해서 변경하는것이 좋다.  
		Card.height = 80; // card 클래스에 직접 접근해서 변경  /final을 붙일시 변경불가 //static final int HEIGHT 였으면 불가 // 
		
		System.out.print("c1은 " + c1.kind +" ,"+ c1.number+"이며");
		System.out.println("크기는: " + c1.width +", "+ c1.height);
		System.out.print("c1은 " + c2.kind +" ,"+ c2.number+"이며");
		System.out.println("크기는: " + c2.width +", "+ c2.height);
		
	}
	

}

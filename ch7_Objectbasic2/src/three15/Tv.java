package three15;

public class Tv {
	//tv 속성 (인스턴스 변수)
	
	boolean power;
	int channel;
	//tv 기능 (메서드) 
	void power() {

		power = !power;
	}

	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	
  //1. 
}

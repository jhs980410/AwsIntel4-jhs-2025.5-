package ch6_ObjectBasic;

public class Tv {
	//tv 속성 (멤버변수)
	String color;
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

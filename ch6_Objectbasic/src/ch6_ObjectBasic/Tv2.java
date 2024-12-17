package ch6_ObjectBasic;

import java.util.regex.Pattern;

public class Tv2 {
	// tv 속성 (멤버변수)
	String color;
	boolean power;
	int channel;
	int voluem;
	
	public Pattern tvName;
	

	// tv 기능 (메서드)
	void power() {

		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}

	// 1.
}

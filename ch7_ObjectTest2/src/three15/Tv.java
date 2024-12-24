package three15;

public class Tv { 

	boolean power;
	int channel;
	int volume = 0;
	
	public void power(){
		power = !power;
	}
	
	void channelUp(){
		++channel;
	}
	
	void channelDown(){
		--channel;
	}
	
	void volumeUp() {
		
		this.volume++;	
	}
	void volumeDown() {
		
		this.volume--;	
	}
	
	// 볼륨 업 기능구현
	
	
	// 볼륨 다운 기능구현
	
		
}

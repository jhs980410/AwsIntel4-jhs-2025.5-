package three15;

public class SilenceTv extends Tv { // TV기능 물려받기

	boolean silence = true;
	int beforeVolume = 0;

	// 음소거 속성을 키거나 끈다

	// 이전 볼륨의 값

	// 음소거버튼 기능구현
	void silenceButton() {

		if (silence != true) {
			beforeVolume = volume;
			volume = 0;
			this.silence = true;
		} else if (silence == true) {
			volume = beforeVolume;
			beforeVolume = 0;
			this.silence = false;
		}

	}

	/*
	 * 버튼을 누를때 마다 음소거 상태는 변경
	 * 
	 * 음소거 속성이 켜졌는지, 꺼져있는지 켜져있으면 ... 소리를 끈다 꺼져있으면... 이전 볼륨으로
	 */

}
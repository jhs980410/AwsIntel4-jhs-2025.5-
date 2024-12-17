package ch6_ObjectBasic;

//시간의 개념 ,
//시,분,초는 모두 0보다 크거나 같아야한다
//시는 0~24미만 , 분,초는 0~ 59미만 // 



public class Time {
	int hour = 0;
	int minute = 0;
	int second = 0;

	int getHour() {
		return hour;

	}

	void sethour(int h) {
		if (h < 0 || h >= 24) {
			return;
		}
		hour = h;
	}

	int getminute() {
		return minute;

	}

	void setminute(int m) {
		if (m < 0 || m > 59) {
			return;
		}
		minute = m;
	}

	int getsecond() {
		return second;

	}

	void setsecond(int s) {
		if (s < 0 || s >= 59) {
			return;
		}
		second = s;
	}

}

package ch6_ObjectBasic;

public class TimeMain2 {
	public static void main(String[] args) {
		int h = 0;
		int m = 0;
		int s = 0;
		Time koreaTime = new Time();
		Time japanTime = new Time();
		Time usaTime = new Time();

		h = 2;
		m = 52;
		s = 26;
		koreaTime.hour = h;
		koreaTime.minute = m;
		koreaTime.second = s;

		japanTime.sethour(h);
		japanTime.setminute(m);
		japanTime.setsecond(s);
		h = 15;
		m = 52;
		s = 2600;
		usaTime.sethour(h);
		usaTime.setminute(m);
		usaTime.setsecond(s);

		// 미국시간 - 14시간

		System.out.println("한국 시간");
		System.out.println(koreaTime.hour + ":" + koreaTime.minute + ":" + koreaTime.second);
		System.out.println("일본 시간");
		System.out.println(japanTime.hour + ":" + japanTime.minute + ":" + japanTime.second);
		System.out.println("미국 시간");
		System.out.println(usaTime.getHour() + ":" + usaTime.getminute() + ":" + usaTime.getsecond());
	}
}

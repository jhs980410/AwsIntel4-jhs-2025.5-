package ch6_Objecttest;

public class TvTest1 {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.power();
		tv.color = "black";
		tv.channel = 7;
		
		Tv tv2 = new Tv();
		tv2.channel = 100;
		tv2.channelDown();
		tv2.channelDown();
		tv2.channelDown();
		
		
		System.out.println("첫 tv\n"+tv.info());
		System.out.println();
		System.out.println("tv2\n"+tv2.info());
		
	}
}

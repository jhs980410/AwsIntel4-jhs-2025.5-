package ch6_Objecttest;

import java.util.Scanner;

public class TvTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tv2 tv = new Tv2(); // 0 X 100
		Tv2 tv2 = new Tv2();// 0 X 200 
		tv.name = "삼성";
		System.out.println("tv의 원하는 색상입력");
		tv.color = sc.nextLine();
		tv2.name = tv.name;
		tv2.channel = tv.channel;
		tv2.color = tv.color;

		tv2.name = "LG";
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelUp();
		System.out.println("tv명 : " + tv.name);
		System.out.println("색상 : " + tv.color);
		System.out.println("현재 채널 : " + tv.channel);
		System.out.println();
		System.out.println("tv명 : " + tv2.name);
		System.out.println("색상 : " + tv2.color);
		System.out.println("현재 채널 : " + tv2.channel);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

	}

}

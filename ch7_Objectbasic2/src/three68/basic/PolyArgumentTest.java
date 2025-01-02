package three68.basic;

public class PolyArgumentTest {

	public static void main(String[] args) {

		Human human = new Human("정현식");
		Human human1 = new Human("최유혁");
		Human human2 = new Human("오우람");
		Human human3 = new Human("박찬정");
		Tv t = new Tv();
			
		System.out.println(human);
		human.buy(t);

		System.out.println("현재 남은 돈은 : " + human.money + "만원입니다");
		System.out.println("현재 보너스 점수는 : " + human.bonusPoint + "점입니다");

		System.out.println();

		Com com = new Com();

		human1.buy(com);

		System.out.println("현재 남은 돈은 : " + human1.money + "만원입니다");
		System.out.println("현재 보너스 점수는 : " + human1.bonusPoint + "점입니다");
		System.out.println();

		Aircon aircon = new Aircon();
		human2.buy(aircon);

		System.out.println("현재 남은 돈은 : " + human2.money + "만원입니다");
		System.out.println("현재 보너스 점수는 : " + human2.bonusPoint + "점입니다");

		System.out.println();

		Nintendo nintendo = new Nintendo();
		
		human3.buy(nintendo);

		System.out.println("현재 남은 돈은 : " + human3.money + "만원입니다");
		System.out.println("현재 보너스 점수는 : " + human3.bonusPoint + "점입니다");

		System.out.println();
		
	


	}

}
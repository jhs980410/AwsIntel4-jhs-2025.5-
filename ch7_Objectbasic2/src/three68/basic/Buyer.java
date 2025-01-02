package three68.basic;

public class Buyer {
	
	public int money = 1000;
	public int bonusPoint = 0;

//	tv구매
	public void buy(Product p) {
		
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		
		System.out.println(p.toString() + "을/를 구입하셨습니다.");
	}

}

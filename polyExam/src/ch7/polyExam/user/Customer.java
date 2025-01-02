package ch7.polyExam.user;

import ch7.polyExam.product.Product;
import ch7.polyExam.product.Tv;

public class Customer {
	private int money; // 소유금액
	private int bonusPoint; // 보너스점수
	private boolean buyNumber = true;

	public boolean getBuyNumber() {
		return buyNumber;
	}

	public void setBuyNumber(boolean buyNumber) {
		this.buyNumber = buyNumber;
	}

	public Customer() {

	}

	public void setbuyNumber(boolean buyNumber) {
		buyNumber = buyNumber;
	}

	public Customer(int money, int bonusPoint) {
		super();
		this.money = money;
		this.bonusPoint = bonusPoint;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public void buy(Product p) {
		if (buyNumber) {
			if (money < p.getPrice()) {
				System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
				return;
			}

			money -= p.getPrice(); // 가진 돈에서 구입한 제품의 가격을 뺀다.
			bonusPoint += p.getBonusPoint(); // 제품의 보너스 점수를 추가한다.
			System.out.println(p + "을/를 구입하셨습니다.");
			this.buyNumber = false;

		} else if (!buyNumber) {
			System.out.println("제품은 하나만 구매 할 수 있습니다.");
		}
		

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "현재 남은 돈은 " + money + "만원입니다.\n";
		str = str + "현재 보너스점수는 " + bonusPoint + "점입니다.\n";

		return str;

	}
}

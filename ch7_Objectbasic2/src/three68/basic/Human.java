package three68.basic;

public class Human extends Buyer {
	private String name;
	
	public Human() {
		
	}
	
	public Human(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void buy(Product p) {

		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint = bonusPoint + p.bonusPoint;

		System.out.println(name+ "님은 "+p.toString() + "을/를 구입하셨습니다.");
		
	}

	@Override
	public String toString() {
		return "이름: "+name;
	}
	
	
}

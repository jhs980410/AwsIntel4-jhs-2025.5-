package hk.exam.eight;

// 면세점
public class FreeShop {

	// 면세점이 열리면 책, 컴퓨터, Tv, 스마트폰을 한개 판매 가능하다
	// 상품을 한번 판매한 경우 해당 상품은 존재하지 않는다. ex) 책을 팔았으면 책은 존재하지 않음 하지만 나머지 상품은 존재한다.

	double storeMoney = 0; // 주인장의 소지금
	private Book book = null; // 책 한권
	private Computer computer = null; // 컴퓨터 한개
	private Tv tv = null; // Tv 한개
	private SmartPhone smartPhone = null; // 스마트폰 한개

	public FreeShop() {
		super();
	}

	public FreeShop(Book book, Computer computer, Tv tv, SmartPhone smartPhone) {
		this.storeMoney = 100000; // 초기자금은 무조건 10만원
		this.book = book;
		this.computer = computer;
		this.tv = tv;
		this.smartPhone = smartPhone;
	}

	// 물건 구입
	// 메서드명 buy로 작성하시오
	/**
	 * @param customer 고객
	 * @param ??       어떤 상품을 살까
	 * @throws CloneNotSupportedException
	 */

	// 물건이 존재하는지 여부

	// 물건이 존재하면 구매 가능여부 확인
	// 나의 소지금으로 해당 상품의 구매가 가능하면

	// 나의 소지금으로 해당 상품의 구매가 불가능하면
	public void buy(Customer customer, Book book) {
		if (customer.getMoney() > book.price) {
			System.out.println(book.name + "을 구매하셨습니다");
			double money = customer.getMoney();
			customer.setMoney(money - book.price);
			// 제품을 구입할 때 얻는 보너스점수는 제품가격의 7.13%로 지정(단, 소수점 3째자리에서 반올림 한다.)

			double bonus = Math.round((book.price * 0.0713) * 1000) / 1000.0;
			double myBonusPo = customer.getMyBonusPoint();
			if (myBonusPo != 0.0) {
				myBonusPo = myBonusPo + bonus;
				customer.setMyBonusPoint(myBonusPo);
				customer.setProduct(book);
			} else if (myBonusPo == 0.0) {
				customer.setMyBonusPoint(bonus);
			}
		} else if (customer.getMoney() < book.price) {
			System.out.println(book.name + "을 구매하기에");
			System.out.println(book.price - customer.getMoney() + "가 부족합니다.");
		}
			
	}

	public void buy(Customer customer, Computer computer) {

			if (customer.getMoney() > computer.price) {
				System.out.println(computer.name + "을 구매하셨습니다");
				double money = customer.getMoney();
				customer.setMoney(money - computer.price);
				// 제품을 구입할 때 얻는 보너스점수는 제품가격의 7.13%로 지정(단, 소수점 3째자리에서 반올림 한다.)
				double bonus = Math.round((computer.price * 0.0713) * 1000) / 1000.0;
				double myBonusPo = customer.getMyBonusPoint();
				if (myBonusPo != 0.0) {
					myBonusPo = myBonusPo + bonus;
					customer.setMyBonusPoint(myBonusPo);
					customer.setProduct(computer);
				} else if (myBonusPo == 0.0) {
					customer.setMyBonusPoint(bonus);
				}
			} else if (customer.getMoney() < computer.price) {
				System.out.println(computer.name + "을 구매하기에");
				System.out.println(computer.price - customer.getMoney() + "가 부족합니다.");
			}

		}

	

	public void buy(Customer customer, SmartPhone smartPhone) {
		
			if (customer.getMoney() > smartPhone.price) {
				System.out.println(smartPhone.name + "을 구매하셨습니다");
				double money = customer.getMoney();
				customer.setMoney(money - smartPhone.price);
				// 제품을 구입할 때 얻는 보너스점수는 제품가격의 7.13%로 지정(단, 소수점 3째자리에서 반올림 한다.)
				double bonus = Math.round((smartPhone.price * 0.0713) * 1000) / 1000.0;
				double myBonusPo = customer.getMyBonusPoint();
				if (myBonusPo != 0.0) {
					myBonusPo = myBonusPo + bonus;
					customer.setMyBonusPoint(myBonusPo);
					customer.setProduct(smartPhone);
				} else if (myBonusPo == 0.0) {
					customer.setMyBonusPoint(bonus);
				}
			} else if (customer.getMoney() < book.price) {
				System.out.println(smartPhone.name + "을 구매하기에");
				System.out.println(smartPhone.price - customer.getMoney() + "가 부족합니다.");
			}

		

	}

	public void buy(Customer customer, Tv tv) {
	 
			if (customer.getMoney() > tv.price) {
				System.out.println(tv.name + "을 구매하셨습니다");
				double money = customer.getMoney();
				customer.setMoney(money - tv.price);
				// 제품을 구입할 때 얻는 보너스점수는 제품가격의 7.13%로 지정(단, 소수점 3째자리에서 반올림 한다.)
				double bonus = Math.round((tv.price * 0.0713) * 1000) / 1000.0;
				double myBonusPo = customer.getMyBonusPoint();
				if (myBonusPo != 0.0) {
					myBonusPo = myBonusPo + bonus;
					customer.setMyBonusPoint(myBonusPo);
					customer.setProduct(tv);
				} else if (myBonusPo == 0.0) {
					customer.setMyBonusPoint(bonus);
				}

			} else if (customer.getMoney() < tv.price) {
				System.out.println(tv.name + "을 구매하기에");
				System.out.println(tv.price - customer.getMoney() + "가 부족합니다.");
			}

		}

	

	@Override
	public String toString() {
		return "FreeShop 상태 = 매진: [storeMoney=" + storeMoney + ", book=" + book + ", computer=" + computer + ", tv="
				+ tv + ", smartPhone=" + smartPhone + "]";
	}

}

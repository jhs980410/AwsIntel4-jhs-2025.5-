package ch6_Objecttest;

public class Card {
	static final String MAKER = "정현식";
	static final int width = 100;
	static final int height = 200;
	String kind;
	int number;

	public Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	
	void cardNumber() {
		for (int i = 1; i <= number; i++) {
			System.out.print(kind + i + " ");
		}
	}

	void makerName() {
		System.out.println("제작자: " + MAKER);
	}

}

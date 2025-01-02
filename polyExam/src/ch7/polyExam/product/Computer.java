package ch7.polyExam.product;

public class Computer extends Product {
	
	public Computer() {
		super(200);
	}
	public void use() {
		System.out.println("컴퓨터를 사용 중");
	
	}

	public String toString() {
		return "Computer";
	}
}

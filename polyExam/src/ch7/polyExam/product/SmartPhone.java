package ch7.polyExam.product;

public class SmartPhone extends Product{
	public SmartPhone() {
		super(70);
	}
	public void use() {
		System.out.println("폰 사용 중");
	
	}

	public String toString() {
		return "SmartPhone";
	}
}

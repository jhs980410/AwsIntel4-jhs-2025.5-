package three68.basic;

public class Aircon extends Product{
	public Aircon() {
		super(500);
	}
	void use() {
		System.out.println("에어를 사용즁");
	
	}

//	어노테이션
	@Override
	public String toString() {
		return "Aircon";
	}
	
}

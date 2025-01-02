package ch7.polyExam.product;

public class Book extends Product{

	public Book() {
		super(1);
	}
	public void use() {
		System.out.println("책을 읽는 중");
	
	}

	public String toString() {
		return "Book";
	}

}

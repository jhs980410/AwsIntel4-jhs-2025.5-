package three50.book;

public class Book {
	private String title;
	private String author;
	private String company;
	private int price;
	private String publicationDate;
	
	public Book() {
		
	}

	public Book(String title, String author, String company, int price, String publicationDate) {
		super();
		this.title = title;
		this.author = author;
		this.company = company;
		this.price = price;
		this.publicationDate = publicationDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public void info() {
		
		System.out.println("책 제목: " + this.title);
		System.out.println("책 지은이: " + this.author);
		System.out.println("책 출판사: " + this.company);
		System.out.println("책 가격: " + this.price + "원");
		System.out.println("책출판날짜: " + this.publicationDate);
	}
	
	
	
	
	
	
	
	
	
}

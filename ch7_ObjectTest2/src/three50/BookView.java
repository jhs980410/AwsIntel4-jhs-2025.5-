package three50;

import three50.book.Book;

public class BookView {
	public static void main(String[] args) {
		Book book = new Book();
		Book book2 = new Book("마이너리티 리포트","필립 K. 딕","폴라북스",20700,"2015.07.30");
		
		book.setTitle("SQLD 노랭이");
		book.setAuthor("한국데이터산업진흥원");
		book.setCompany("한국데이터산업진흥원");
		book.setPrice(18000);
		book.setPublicationDate("2023.12.29");
		book.info();
		
		System.out.println();		
		book2.info();
	}

}

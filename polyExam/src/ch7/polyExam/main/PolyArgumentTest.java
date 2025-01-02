package ch7.polyExam.main;

import java.util.Scanner;

import ch7.polyExam.product.Book;
import ch7.polyExam.product.Computer;
import ch7.polyExam.product.SmartPhone;
import ch7.polyExam.product.Tv;
import ch7.polyExam.user.Customer;

// 다형성 활용 -> 메서드 매개변수
class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//				Customer customer = new Customer(1000,0);
//				customer.buy(new Tv());
//				System.out.println(customer.toString());
//				
//				customer.buy(new Computer());
//				System.out.println(customer.toString());
//			
//				customer.buy(new SmartPhone());
//				System.out.println(customer.toString());
//
//				customer.buy(new Book());
//				System.out.println(customer.toString());
		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer(1000, 0);
		System.out.println("1번: tv");
		System.out.println("2번: 컴퓨터");
		System.out.println("3번: 스마트폰");
		System.out.println("4번: 책");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			Tv tv = new Tv();
			customer.buy(tv);

			System.out.println(customer.toString());
			
			tv.use();

			break;
		case 2:
			Computer computer = new Computer();
			customer.buy(computer);

			System.out.println(customer.toString());

			computer.use();

			break;

		case 3:
			SmartPhone smartPhone = new SmartPhone();
			customer.buy(smartPhone);
			
			System.out.println(customer.toString());

			smartPhone.use();

			break;

		case 4:
			Book book = new Book();
			customer.buy(book);

			System.out.println(customer.toString());

			book.use();

			break;
			

		}

	}

}

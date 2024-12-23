package two95;

import java.util.Objects;

public class Car {
	String model = "";
	String color = "";
	String gearType = "";
	String distinct = "";
	int door = 0;
	int price = 0;

	public Car() {
		this("테슬라", "검정", "자동","전기차",4,5);
		System.out.println("price");
	}

	public Car(String model, String color, String gearType, String distinct, int door, int price) {
		this.model = model;
		this.color = color;
		this.gearType = gearType;
		this.distinct = distinct;
		this.door = door;
		this.price = price;
	}

	public Car(String model, String color, String gearType, String distinct, int price) {
		this.model = model;
		this.color = color;
		this.gearType = gearType;
		this.distinct = distinct;
		this.price = price;
	}

	public Car(String model, String color, String gearType, int price) {
		this.model = model;
		this.color = color;
		this.gearType = gearType;
		this.price = price;
	}

	public Car(String model, String color, int price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}

	public Car(String model, int price) {
		this.model = model;
		this.price = price;

	}

	public Car(int price) {

		this.price = price;

	}

	void myCar() {
		System.out.println("모델명 :" + model);
		System.out.println("색상: " + color);
		System.out.println("기어: " + gearType);
		System.out.println("도어 갯수 " + door+"개");
		System.out.println("가격: " + price+"달러");
		System.out.println("특징: " + distinct);
	}
	void myCarModel() {
		System.out.println(model+"의 모델명 :" + model);
	}
	void myCarColor() {
		System.out.println(model+"의 색상: " + color);
	}
	void myCarGearType() {
		System.out.println(model+"의 기어: " + gearType);
	}
	void myCarDoor() {
		System.out.println(model+"의 도어 갯수 " + door+"개");
	}
	void myCarPrice() {
		System.out.println("가격: " + price+"달러");
	}
	void myCarDistinct() {
		System.out.println("특징: " + distinct);
	}
	
	void carinfo() {
		
	}

	
	
	
	

}

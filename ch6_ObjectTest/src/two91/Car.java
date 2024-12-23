package two91;

import java.util.Objects;

public class Car {
	String model = "";
	String color = "";
	String gearType = "";
	String distinct = "";
	int door = 0;
	int price = 0;

	public Car() {
		//
	}

	public Car(String mo, String co, String gear, String dist, int d, int pr) {
		model = mo;
		color = co;
		gearType = gear;
		distinct = dist;
		door = d;
		price = pr;
	}

	public Car(String mo, String co, String gear, String dist, int pr) {
		model = mo;
		color = co;
		gearType = gear;
		distinct = dist;
		price = pr;
	}

	public Car(String mo, String co, String gear, int pr) {
		model = mo;
		color = co;
		gearType = gear;
		price = pr;
	}

	public Car(String mo, String co, int pr) {
		model = mo;
		color = co;
		price = pr;
	}

	public Car(String mo, int pr) {
		model = mo;
		price = pr;

	}

	public Car(int pr) {

		price = pr;

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
	

}

package two91;

import java.sql.DatabaseMetaData;

public class CarMain {
	public static void main(String[] args) {
		
		Car car = new Car("에어택시", "회색", "자동","날아다니는자동차" , 4, 99000);
		car.myCar();
		
		car.myCarGearType();
	}
}



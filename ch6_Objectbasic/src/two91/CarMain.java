package two91;

public class CarMain {
		public static void main(String[] args) {
			String color = "";
			String gearType = "";
			int door = 0;
			
			Car car = new Car();
			
			car.color="red";
			car.gearType ="manual";
			car.door =4;
			
			System.out.println(car.color);
			System.out.println(car.gearType);
			System.out.println(car.door);
			
			color = "blue";
			gearType = "auto";
			door = 2;
			
			Car car2 = new Car(color, gearType, door);
			
			
			System.out.println(car2.color);
			System.out.println(car2.gearType);
			System.out.println(car2.door);

			
		}

	
}

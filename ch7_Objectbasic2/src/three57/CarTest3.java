package three57;

import three57.basic.Ambulance;
import three57.basic.Car;
import three57.basic.FireEngine;

public class CarTest3 {

	public static void main(String[] args) {
		
		Car car = new Car();  // 0x 100 
//		소방차 1대
		FireEngine fe1;        // 선언만      
		Ambulance am1 = null;  // 선언만 
		
//		System.out.println(fe1);
		
		fe1 = null;    //선언후 주소 x null 
		
		System.out.println(fe1); // null이니까  null출력 
//		fe1.water();
		
//		부모 객체는 자식참조변수에 할당 불가능
//		fe1 = (FireEngine)car; // 자식과 부모관게는 
//		fe1.drive();
//		fe1.stop();
//		fe1.water();
		
//		명식적 형변환
		am1 = (Ambulance)new Car(); 
		
		am1.siren();
		
		
		
	}
	
	
}

package ch6_ObjectBasic;

public class ch6_VariableBasic1 {
	int iv =0; // 인스턴스 변수 
	static int cv = 0;  // static (클래스 변수) (공유변수)  
	
	void method() {
		//메서드영역
		int iv = 0; // 지역변수 , 메서드 내에서만 사용가능 for의 i같은 //
	}
	
	// 변수의 종류                선언위치                   생성시기 
	//static variable        클래스영역                     클래스가 메모리에 올라갈 때
	//instance variable     클래스영역                      인스턴스 변수가 생성되었을 때 
	//local variable       클래스영역 이외의 영역(메서드,생성자)    변수 선언문이 수행되었을 때  
	
	 
	
	
}

package three30;

public class Child3 extends Parent {
	
	int x = 20;
	public Child3() {
		super();
		
	}
	void method() {
		System.out.println("x : " + x);
		System.out.println("this.x : "+ this.x );
		System.out.println("super.x: " + super.x);

	
	}
}

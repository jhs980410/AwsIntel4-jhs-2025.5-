package three10;

public class ParentMain {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Child2 c2 = new Child2();
		
		
	
		
		p.age = 1;
		c.age = 2;
		System.out.println(c.age);
		
		
		c.method();
		c.play();
		c2.age = 3;
		 
		Child3 child3 = new Child3();
		
	}
}

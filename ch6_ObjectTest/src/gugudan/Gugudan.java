package gugudan;

public class Gugudan {
	int dan;
	int num;
	
	
	public Gugudan() {
		
	}
	
	public Gugudan(int dan, int num) {

		this.dan = dan;
		this.num = num;
	}

	

	void gugudanAll() {
		for (int i = 1; i <= 9; i++) {
			System.out.println();
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " x " + i + "= " + (i*j)+"\t");	
			}

		}
	}
	

}

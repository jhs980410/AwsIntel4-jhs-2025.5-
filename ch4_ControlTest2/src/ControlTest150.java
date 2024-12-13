import java.util.Iterator;

public class ControlTest150 {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {			
			sum += i;
			System.out.println("1부터 "+ i + "까지의 합은: "+  sum);
		}
		

	}
}

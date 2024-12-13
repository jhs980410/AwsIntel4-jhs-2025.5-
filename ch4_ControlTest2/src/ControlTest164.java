
public class ControlTest164 {
	public static void main(String[] args) {
		// 1 - 1 2- 3 3 - 6

		double num = 1.0;
		double num2 = 1.0;
		while (num <= 200) {
			double result = (num * num2);
//			if (result > 100.0) {
//				System.out.println("===========100넘음 =============");
//				break;
//			}
			System.out.println((int) num + " - " + (int) result);
			num2 = num2 + 0.5;
			num = num + 1.0;

		}
	}
}

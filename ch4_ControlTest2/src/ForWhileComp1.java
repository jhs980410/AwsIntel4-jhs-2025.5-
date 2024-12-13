
public class ForWhileComp1 {
	public static void main(String[] args) {
		// for문으로 1~100 까지중 짝수들만 더한것 //
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = +sum + i;

			}

		}
		System.out.println(sum);

	}
}
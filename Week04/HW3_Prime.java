import java.util.Scanner;

public class HW3_Prime {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int x = 2;
		while (n > 0) {
			boolean isPrime = true;
			for (int j = 2; j * j <= x && isPrime; j++) {
				if (x % j == 0)
					isPrime = false;
			}
			if (isPrime && n > 1) {
				System.out.print(x + " ");
				n--;
			} else if (isPrime && n == 1) {
				System.out.print(x);
				n--;
			}

			x++;
		}
		kb.close();
	}
}
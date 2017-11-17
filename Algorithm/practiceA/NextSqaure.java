package practiceA;

import java.util.Scanner;

public class NextSqaure {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = 0;
		// int x = (int) Math.sqrt(n);
		// System.out.println(x);
		for (x = 1; x <= (n / 2); x++) {
			if (n == (x * x)) {
				System.out.println(x + "+1ÀÇ Á¦°ö±Ù= " + (x + 1) * (x + 1));
				break;
			} else {
				System.out.println("NO");
			}

		}
	}
}

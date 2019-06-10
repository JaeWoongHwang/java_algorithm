package programmers;

import java.util.Scanner;

public class InspectPrimeNum {

	public static void main(String[] args) {
		// Check Prime Numbers
		Scanner snr = new Scanner(System.in);
		int testNum = snr.nextInt();
		int i = 2, j = testNum - 1;

		while (true) {
			if (i <= j) {
				if (testNum % i == 0) {
					System.out.print("This is not a prime number");
					break;
				} else {
					i++;
				}
			} else {
				System.out.print("This is a prime number");
				break;
			}
		}
	}

}
